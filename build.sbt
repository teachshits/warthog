name := "Warthog"

organization := "org.warthog"

version := "0.1-SNAPSHOT"

libraryDependencies ++= Seq(
    "org.specs2" % "specs2_2.10" % "1.12.3",
    "org.specs2" % "specs2-scalaz-core_2.10" % "6.0.1" % "test",
    "net.java.dev.jna" % "jna" % "3.3.0",
    "org.scalacheck" %% "scalacheck" % "1.10.0" % "test")

resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"
)

scalaVersion := "2.10.0"

parallelExecution in Test := false

initialCommands in console := """
    import org.warthog.generic.formulas._
    import org.warthog.pl.formulas._
    import org.warthog.fol.formulas._
    import org.warthog.pl.parsers._
    import org.warthog.fol.parsers.tptp._
"""

//scalacOptions ++= Seq("-unchecked", "-deprecation")
