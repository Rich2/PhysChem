/* Copyright 2025 Richard Oliver. Licensed under Apache Licence version 2.0. */
name := "PhysChem"
version := "0.0.1"
scalaVersion := "3.6.4"
lazy val root = (project in file("."))//.dependsOn(util, geom)
Compile/scalaSource := baseDirectory.value / "src"
//lazy val util = ProjectRef(uri("https://github.com/Rich2/openstrat.git"), "Util")
//lazy val geom = ProjectRef(uri("https://github.com/Rich2/openstrat.git"), "Geom")
resolvers += "RichStrat" at "https://richstrat.com/repository"
libraryDependencies += "com.richstrat" % "rutil" % "0.3.6" withSources() withJavadoc()
libraryDependencies += "com.richstrat" % "geom" % "0.3.6" withSources() withJavadoc()