val derby = "org.apache.derby" % "derby" % "10.4.1.3"
val parser = "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"

ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.12.8"
ThisBuild / version      := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := "tapl-in-scala",
    libraryDependencies += parser
  )
