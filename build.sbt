import SonatypeKeys._

import sbt.Keys._

sonatypeSettings

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)

name := "ScalaJS build size test"

normalizedName := "scala-js-collection-build-size-test"

version := "0.1-SNAPSHOT"

organization := "io.surfkit"

scalaVersion := "2.11.6"

crossScalaVersions := Seq("2.10.4", "2.11.5")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.2"
)

jsDependencies in Test += RuntimeDOM

homepage := Some(url("http://www.surfkit.io/"))

licenses += ("MIT License", url("http://www.opensource.org/licenses/mit-license.php"))

