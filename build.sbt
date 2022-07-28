ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "sbt-new-test"
  )


libraryDependencies ++= Seq(
  "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-core"   % "2.13.38",
  "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % "2.13.38"
)

libraryDependencies += "org.apache.spark" %% "spark-core" % "3.3.0" % "provided"


//libraryDependencies += "io.circe" %%% "circe-core" % "0.14.2"
//libraryDependencies += "io.circe" %% "circe-parser" % "0.14.2"
