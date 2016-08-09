
build:
	sbt clean compile
	sbt pack

pack:
	sbt pack-archive

run-loader:
	env JAVA_OPTS="-Xmx8g -Xms8g -server -XX:+UseParallelGC -XX:NewRatio=10 -verbose:gc -XX:+PrintGCDetails" \
	env APP_PARQUET_PATH=/Users/dmitry/playground/data/test_1M \
	./target/pack/bin/parquet-loader-main
