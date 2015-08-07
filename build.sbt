name := "SparkDistributedMatrix"

version := "1.0"

scalaVersion := "2.10.5"

libraryDependencies ++=Seq("org.apache.spark" %% "spark-core" % "1.4.0")

libraryDependencies ++=Seq("org.apache.spark" %% "spark-mllib" % "1.4.0")

libraryDependencies ++=Seq("org.apache.spark" %% "spark-sql" % "1.4.0")