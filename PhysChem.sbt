/* Copyright 2025 Richard Oliver. Licensed under Apache Licence version 2.0. */
name := "PhysChem"
version := "0.0.1"
ThisBuild/scalaVersion := "3.6.4"
val osUri = uri("https://github.com/Rich2/openstrat.git#a1f3deb")
lazy val Util = ProjectRef(osUri, "Util")
lazy val Geom = ProjectRef(osUri, "Geom")
lazy val GeomFx = ProjectRef(osUri, "GeomFx")

lazy val Particle = project.dependsOn(Util, Geom).settings(
  Compile/scalaSource := baseDirectory.value / "src",
)

lazy val PartFx = project.dependsOn(Particle, GeomFx).settings(
  Compile/scalaSource := baseDirectory.value / "src",
  libraryDependencies += "org.openjfx" % "javafx-controls" % "15.0.1" withSources() withJavadoc(),
)

//ThisBuild/resolvers += "RichStrat" at "https://richstrat.com/repository"
// libraryDependencies += "com.richstrat" % "rutil" % "0.3.6" withSources() withJavadoc(),
// libraryDependencies += "com.richstrat" % "geom" % "0.3.6" withSources() withJavadoc(),
//libraryDependencies += "com.richstrat" % "geomfx" % "0.3.6", //withSources() withJavadoc(),