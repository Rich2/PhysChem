/* Copyright 2025 Richard Oliver. Licensed under Apache Licence version 2.0. */
name := "PhysChem"
version := "0.0.1"
scalaVersion := "3.6.4"
resolvers += "RichStrat" at "https://richstrat.com/repository"
libraryDependencies += "com.richstrat" % "rutil" % "0.3.5"
libraryDependencies += "com.richstrat" % "geom" % "0.3.5"
Compile/scalaSource := baseDirectory.value / "src"