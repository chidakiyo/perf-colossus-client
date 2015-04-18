name := """hello-scala-2_11"""

version := "1.0"

scalaVersion := "2.11.0"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.1.3" % "test"

libraryDependencies += "com.tumblr" %% "colossus" % "0.5.1"

fork in run := true