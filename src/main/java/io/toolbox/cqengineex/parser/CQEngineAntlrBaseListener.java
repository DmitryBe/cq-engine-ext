package io.toolbox.cqengineex.parser;


import com.googlecode.cqengine.attribute.Attribute;
import com.googlecode.cqengine.query.Query;
import com.googlecode.cqengine.query.QueryFactory;
import com.googlecode.cqengine.query.logical.And;
import com.googlecode.cqengine.query.logical.Or;
import com.googlecode.cqengine.query.option.AttributeOrder;
import com.googlecode.cqengine.query.option.OrderByOption;
import com.googlecode.cqengine.query.option.QueryOptions;
import com.googlecode.cqengine.query.parser.common.QueryParser;
import io.toolbox.cqengineex.DCQGrammarBaseListener;
import io.toolbox.cqengineex.DCQGrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;
import static com.googlecode.cqengine.query.parser.common.ParserUtils.getParentContextOfType;
import static com.googlecode.cqengine.query.parser.common.ParserUtils.validateAllQueriesParsed;
import static com.googlecode.cqengine.query.parser.common.ParserUtils.validateExpectedNumberOfChildQueries;

public class CQEngineAntlrBaseListener<O> extends DCQGrammarBaseListener {

    protected final QueryParser<O> queryParser;
    // A map of parent context, to parsed child queries belonging to that context...
    protected final Map<ParserRuleContext, Collection<Query<O>>> childQueries = new HashMap<ParserRuleContext, Collection<Query<O>>>();
    // The parsed orderBy clause, if found...
    protected OrderByOption<O> orderByOption = null;
    protected int numQueriesEncountered = 0;
    protected int numQueriesParsed = 0;

    /*
        ctor
    */
    public CQEngineAntlrBaseListener(QueryParser<O> queryParser) {
        this.queryParser = queryParser;
    }

    // ======== Handler methods for each type of query defined in the antlr grammar... ========

    @Override
    public void exitAndQuery(DCQGrammarParser.AndQueryContext ctx) {
        addParsedQuery(ctx, new And<O>(childQueries.get(ctx)));
    }

    @Override
    public void exitOrQuery(DCQGrammarParser.OrQueryContext ctx) {
        addParsedQuery(ctx, new Or<O>(childQueries.get(ctx)));
    }

    @Override
    public void exitNotQuery(DCQGrammarParser.NotQueryContext ctx) {
        addParsedQuery(ctx, QueryFactory.not(childQueries.get(ctx).iterator().next()));
    }

    @Override
    public void exitEqualQuery(DCQGrammarParser.EqualQueryContext ctx) {
        Attribute<O, Object> attribute = queryParser.getAttribute(ctx.attributeName(), Object.class);
        Object value = queryParser.parseValue(attribute, ctx.queryParameter());
        addParsedQuery(ctx, QueryFactory.equal(attribute, value));
    }

    @Override
    public void exitNotEqualQuery(DCQGrammarParser.NotEqualQueryContext ctx) {
        Attribute<O, Object> attribute = queryParser.getAttribute(ctx.attributeName(), Object.class);
        Object value = queryParser.parseValue(attribute, ctx.queryParameter());
        addParsedQuery(ctx, QueryFactory.not(QueryFactory.equal(attribute, value)));
    }

    @Override
    @SuppressWarnings("unchecked")
    public void exitLessThanOrEqualToQuery(DCQGrammarParser.LessThanOrEqualToQueryContext ctx) {
        Attribute<O, Comparable> attribute = queryParser.getAttribute(ctx.attributeName(), Comparable.class);
        Comparable value = queryParser.parseValue(attribute, ctx.queryParameter());
        addParsedQuery(ctx, QueryFactory.lessThanOrEqualTo(attribute, value));
    }

    @Override
    @SuppressWarnings("unchecked")
    public void exitLessThanQuery(DCQGrammarParser.LessThanQueryContext ctx) {
        Attribute<O, Comparable> attribute = queryParser.getAttribute(ctx.attributeName(), Comparable.class);
        Comparable value = queryParser.parseValue(attribute, ctx.queryParameter());
        addParsedQuery(ctx, QueryFactory.lessThan(attribute, value));
    }

    @Override
    @SuppressWarnings("unchecked")
    public void exitGreaterThanOrEqualToQuery(DCQGrammarParser.GreaterThanOrEqualToQueryContext ctx) {
        Attribute<O, Comparable> attribute = queryParser.getAttribute(ctx.attributeName(), Comparable.class);
        Comparable value = queryParser.parseValue(attribute, ctx.queryParameter());
        addParsedQuery(ctx, QueryFactory.greaterThanOrEqualTo(attribute, value));
    }

    @Override
    @SuppressWarnings("unchecked")
    public void exitGreaterThanQuery(DCQGrammarParser.GreaterThanQueryContext ctx) {
        Attribute<O, Comparable> attribute = queryParser.getAttribute(ctx.attributeName(), Comparable.class);
        Comparable value = queryParser.parseValue(attribute, ctx.queryParameter());
        addParsedQuery(ctx, QueryFactory.greaterThan(attribute, value));
    }

    @Override
    @SuppressWarnings("unchecked")
    public void exitBetweenQuery(DCQGrammarParser.BetweenQueryContext ctx) {
        Attribute<O, Comparable> attribute = queryParser.getAttribute(ctx.attributeName(), Comparable.class);
        List<? extends ParseTree> queryParameters = ctx.queryParameter();
        Comparable lowerValue = queryParser.parseValue(attribute, queryParameters.get(0));
        Comparable upperValue = queryParser.parseValue(attribute, queryParameters.get(1));
        addParsedQuery(ctx, QueryFactory.between(attribute, lowerValue, upperValue));
    }

    @Override
    @SuppressWarnings("unchecked")
    public void exitNotBetweenQuery(DCQGrammarParser.NotBetweenQueryContext ctx) {
        Attribute<O, Comparable> attribute = queryParser.getAttribute(ctx.attributeName(), Comparable.class);
        List<? extends ParseTree> queryParameters = ctx.queryParameter();
        Comparable lowerValue = queryParser.parseValue(attribute, queryParameters.get(0));
        Comparable upperValue = queryParser.parseValue(attribute, queryParameters.get(1));
        addParsedQuery(ctx, QueryFactory.not(QueryFactory.between(attribute, lowerValue, upperValue)));
    }

    @Override
    public void exitInQuery(DCQGrammarParser.InQueryContext ctx) {
        Attribute<O, Object> attribute = queryParser.getAttribute(ctx.attributeName(), Object.class);
        List<? extends ParseTree> queryParameters = ctx.queryParameter();
        Collection<Object> values = new ArrayList<Object>(queryParameters.size());
        for (ParseTree queryParameter : queryParameters) {
            Object value = queryParser.parseValue(attribute, queryParameter);
            values.add(value);
        }
        addParsedQuery(ctx, QueryFactory.in(attribute, values));
    }

    @Override
    public void exitNotInQuery(DCQGrammarParser.NotInQueryContext ctx) {
        Attribute<O, Object> attribute = queryParser.getAttribute(ctx.attributeName(), Object.class);
        List<? extends ParseTree> queryParameters = ctx.queryParameter();
        Collection<Object> values = new ArrayList<Object>(queryParameters.size());
        for (ParseTree queryParameter : queryParameters) {
            Object value = queryParser.parseValue(attribute, queryParameter);
            values.add(value);
        }
        addParsedQuery(ctx, QueryFactory.not(QueryFactory.in(attribute, values)));
    }

    @Override
    public void exitStartsWithQuery(DCQGrammarParser.StartsWithQueryContext ctx) {
        Attribute<O, String> attribute = queryParser.getAttribute(ctx.attributeName(), String.class);
        String value = queryParser.parseValue(attribute, ctx.queryParameterTrailingPercent());
        value = value.substring(0, value.length() - 1);
        addParsedQuery(ctx, QueryFactory.startsWith(attribute, value));
    }

    @Override
    public void exitEndsWithQuery(DCQGrammarParser.EndsWithQueryContext ctx) {
        Attribute<O, String> attribute = queryParser.getAttribute(ctx.attributeName(), String.class);
        String value = queryParser.parseValue(attribute, ctx.queryParameterLeadingPercent());
        value = value.substring(1, value.length());
        addParsedQuery(ctx, QueryFactory.endsWith(attribute, value));
    }

    @Override
    public void exitContainsQuery(DCQGrammarParser.ContainsQueryContext ctx) {
        Attribute<O, String> attribute = queryParser.getAttribute(ctx.attributeName(), String.class);
        String value = queryParser.parseValue(attribute, ctx.queryParameterLeadingAndTrailingPercent());
        value = value.substring(1, value.length() - 1);
        addParsedQuery(ctx, QueryFactory.contains(attribute, value));
    }

    @Override
    public void exitHasQuery(DCQGrammarParser.HasQueryContext ctx) {
        Attribute<O, Object> attribute = queryParser.getAttribute(ctx.attributeName(), Object.class);
        addParsedQuery(ctx, QueryFactory.has(attribute));
    }

    @Override
    public void exitNotHasQuery(DCQGrammarParser.NotHasQueryContext ctx) {
        Attribute<O, Object> attribute = queryParser.getAttribute(ctx.attributeName(), Object.class);
        addParsedQuery(ctx, QueryFactory.not(QueryFactory.has(attribute)));
    }

    /** This handler is called for all queries, allows us to validate that no handlers are missing. */
    @Override
    public void exitQuery(DCQGrammarParser.QueryContext ctx) {
        numQueriesEncountered++;
        validateAllQueriesParsed(numQueriesEncountered, numQueriesParsed);
    }

    @Override
    public void exitOrderByClause(DCQGrammarParser.OrderByClauseContext ctx) {
        List<AttributeOrder<O>> attributeOrders = new ArrayList<AttributeOrder<O>>();
        for (DCQGrammarParser.AttributeOrderContext orderContext : ctx.attributeOrder()) {
            Attribute<O, Comparable> attribute = queryParser.getAttribute(orderContext.attributeName(), Comparable.class);
            boolean descending = orderContext.direction() != null && orderContext.direction().K_DESC() != null;
            attributeOrders.add(new AttributeOrder<O>(attribute, descending));
        }
        this.orderByOption = QueryFactory.orderBy(attributeOrders);
    }

    /**
     * Can be called when parsing has finished, to retrieve the parsed query.
     */
    public Query<O> getParsedQuery() {
        Collection<Query<O>> rootQuery = childQueries.get(null);
        if (rootQuery == null) {
            // There was no WHERE clause...
            return QueryFactory.all(this.queryParser.getObjectType());
        }
        validateExpectedNumberOfChildQueries(1, rootQuery.size());
        return rootQuery.iterator().next();
    }

    /**
     * Can be called when parsing has finished, to retrieve the {@link QueryOptions}, which may include an
     * {@link OrderByOption} if found in the string query.
     *
     * @return The parsed {@link QueryOptions}
     */
    public QueryOptions getQueryOptions() {
        OrderByOption<O> orderByOption = this.orderByOption;
        return orderByOption != null ? QueryFactory.queryOptions(orderByOption) : QueryFactory.noQueryOptions();
    }

    /**
     * Adds the given query to a list of child queries which have not yet been wrapped in a parent query.
     */
    protected void addParsedQuery(ParserRuleContext currentContext, Query<O> parsedQuery) {
        // Retrieve the possibly null parent query...
        ParserRuleContext parentContext = getParentContextOfType(currentContext, getAndOrNotContextClasses());
        Collection<Query<O>> childrenOfParent = this.childQueries.get(parentContext);
        if (childrenOfParent == null) {
            childrenOfParent = new ArrayList<Query<O>>();
            this.childQueries.put(parentContext, childrenOfParent); // parentContext will be null if this is root query
        }
        childrenOfParent.add(parsedQuery);
        numQueriesParsed++;
    }

    protected Class[] getAndOrNotContextClasses() {
        return new Class[] {DCQGrammarParser.AndQueryContext.class, DCQGrammarParser.OrQueryContext.class, DCQGrammarParser.NotQueryContext.class};
    }
}
