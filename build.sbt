name := "logbackSparkProblem"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  //  "org.apache.spark"     %% "spark-core"               % "1.4.0" % "provided",
    "net.logstash.logback" %  "logstash-logback-encoder" % "4.3"
  , "org.slf4j"            % "slf4j-api"                 % "1.7.12"
)
