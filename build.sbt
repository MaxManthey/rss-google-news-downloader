ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "rss-news-downloader"
  )

libraryDependencies += "com.softwaremill.sttp.client3" %% "core" % "3.6.2"
libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "2.1.0"
libraryDependencies += "io.spray" %%  "spray-json" % "1.3.6"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.11"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.12" % Test
libraryDependencies += "org.scalamock" %% "scalamock" % "5.2.0" % Test