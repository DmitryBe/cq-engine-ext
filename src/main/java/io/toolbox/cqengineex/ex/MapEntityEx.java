package io.toolbox.cqengineex.ex;

import com.googlecode.cqengine.query.QueryFactory;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Wrapper for Map to allow efficient use in an IndexCollection.
 * MapEntities can be created via {@link QueryFactory#mapEntity(Map)}. Attributes can be created to read the entries
 * in these maps, using {@link QueryFactory#mapAttribute(Object, Class)}.
 * <p/>
 * This works by optimizing the performance of the {@link #hashCode()} and {@link #equals(Object)} methods - which
 * may be called frequently during query processing. The hashCode of the wrapped Map will be cached to improve the
 * performance of repeated invocations of {@link #hashCode()}. The cached hashCode will be used in the
 * implementation of the {@link #equals(Object)} method too, to avoid computing equality entirely when the cached
 * hashCodes are different.
 * <p/>
 * Note it is not safe to modify entries in maps which are indexed, although non-indexed entries may be modified
 * safely. Alternatively, remove and re-add the Map to the collection.
 */
@SuppressWarnings({"unchecked", "NullableProblems"})
public class MapEntityEx implements Map, Serializable{

    final Map wrappedMap;
    final int cachedHashCode;

    public MapEntityEx(Map mapToWrap) {
        this(mapToWrap, mapToWrap.hashCode());
    }

    protected MapEntityEx(Map mapToWrap, int hashCode) {
        wrappedMap = mapToWrap;
        cachedHashCode = hashCode;
    }

    /**
     * Returns the wrapped map.
     */
    public Map getWrappedMap() {
        return wrappedMap;
    }

    /**
     * Returns the hashcode of the wrapped map which was cached when this MapEntityEx was created.
     * @return the hashcode of the wrapped map which was cached when this MapEntityEx was created.
     */
    @Override
    public int hashCode() {
        return cachedHashCode;
    }

    /**
     * Returns true if the cached hashcodes of both objects are equal and the wrapped maps are equal.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof com.googlecode.cqengine.entity.MapEntity)) {
            return false;
        }

        MapEntityEx that = (MapEntityEx) o;
        if (cachedHashCode != that.cachedHashCode) {
            return false;
        }

        return this.wrappedMap.equals(that.wrappedMap);
    }

    @Override
    public String toString() {
        return "MapEntityEx{" +
                "cachedHashCode=" + cachedHashCode +
                ", wrappedMap=" + wrappedMap +
                '}';
    }

    public Object get(Object key) {
        return wrappedMap.get(key);
    }

    @Override
    public Object put(Object o, Object o2) {
        return wrappedMap.put(o, o2);
    }

    @Override
    public Object remove(Object o) {
        return wrappedMap.remove(o);
    }

    @Override
    public void putAll(Map map) {
        wrappedMap.putAll(map);
    }

    @Override
    public void clear() {
        wrappedMap.clear();
    }

    @Override
    public Set keySet() {
        return wrappedMap.keySet();
    }

    @Override
    public Collection values() {
        return wrappedMap.values();
    }

    @Override
    public Set<Entry> entrySet() {
        return wrappedMap.entrySet();
    }

    @Override
    public int size() {
        return wrappedMap.size();
    }

    @Override
    public boolean isEmpty() {
        return wrappedMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object o) {
        return wrappedMap.containsKey(o);
    }

    @Override
    public boolean containsValue(Object o) {
        return wrappedMap.containsValue(o);
    }
}
