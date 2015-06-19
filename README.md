# Logback problem with Spark

This is a small application that just creates a LogstashBasicMarker
and, when it is executed as Spark job, it throws the runtime
exception:

```
$ ${SPARK_HOME}/bin/spark-submit --master ${MASTER} logbackSparkProblem-assembly-1.0.jar
Exception in thread "main" java.lang.IllegalAccessError: tried to access method org.slf4j.helpers.BasicMarker.<init>(Ljava/lang/String;)V from class org.slf4j.helpers.LogstashBasicMarker
	at org.slf4j.helpers.LogstashBasicMarker.<init>(LogstashBasicMarker.java:25)
	at Main$.delayedEndpoint$Main$1(Main.scala:5)
	at Main$delayedInit$body.apply(Main.scala:3)
	at scala.Function0$class.apply$mcV$sp(Function0.scala:40)
	at scala.runtime.AbstractFunction0.apply$mcV$sp(AbstractFunction0.scala:12)
	at scala.App$$anonfun$main$1.apply(App.scala:71)
	at scala.App$$anonfun$main$1.apply(App.scala:71)
	at scala.collection.immutable.List.foreach(List.scala:318)
	at scala.collection.generic.TraversableForwarder$class.foreach(TraversableForwarder.scala:32)
	at scala.App$class.main(App.scala:71)
	at Main$.main(Main.scala:3)
	at Main.main(Main.scala)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.apache.spark.deploy.SparkSubmit$.org$apache$spark$deploy$SparkSubmit$$runMain(SparkSubmit.scala:664)
	at org.apache.spark.deploy.SparkSubmit$.doRunMain$1(SparkSubmit.scala:169)
	at org.apache.spark.deploy.SparkSubmit$.submit(SparkSubmit.scala:192)
	at org.apache.spark.deploy.SparkSubmit$.main(SparkSubmit.scala:111)
	at org.apache.spark.deploy.SparkSubmit.main(SparkSubmit.scala)
Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
15/06/19 11:07:35 INFO Utils: Shutdown hook called
$
```
