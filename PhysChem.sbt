/* Copyright 2025 Richard Oliver. Licensed under Apache Licence version 2.0. */
name := "PhysChem"
version := "0.0.1"
ThisBuild/scalaVersion := "3.6.4"
ThisBuild/resolvers += "RichStrat" at "https://richstrat.com/repository"
lazy val Util = ProjectRef(uri("https://github.com/Rich2/openstrat.git#06ac8b2"), "Util")
lazy val Geom = ProjectRef(uri("https://github.com/Rich2/openstrat.git#06ac8b2"), "Geom")
lazy val GeomFx = ProjectRef(uri("https://github.com/Rich2/openstrat.git#06ac8b2"), "GeomFx")

lazy val Particle = project.dependsOn(Util, Geom).settings(
  Compile/scalaSource := baseDirectory.value / "src",
  
 // libraryDependencies += "com.richstrat" % "rutil" % "0.3.6" withSources() withJavadoc(),
 // libraryDependencies += "com.richstrat" % "geom" % "0.3.6" withSources() withJavadoc(),
)

lazy val PartFx = project.dependsOn(Particle, GeomFx).settings(
  Compile/scalaSource := baseDirectory.value / "src",
  //libraryDependencies += "com.richstrat" % "geomfx" % "0.3.6", //withSources() withJavadoc(),
  libraryDependencies += "org.openjfx" % "javafx-controls" % "15.0.1" withSources() withJavadoc(),
)