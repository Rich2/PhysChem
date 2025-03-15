/* Copyright 2025 Richard Oliver. Licensed under Apache Licence version 2.0. */
package ppart
import ostrat.*, geom.*, Colour.*

trait ParticlePrimary extends Coloured
{ /** The maximum radius of the particle. */
  def radius: Length
  def circle(scale: Length, xCen: Double = 0, yCen: Double = 0): Circle = Circle(radius / scale, xCen, yCen)
  def fill(scale: Length, xCen: Double = 0, yCen: Double = 0): CircleFill = CircleFill(circle(scale, xCen, yCen), colour)
  def charge: Int
}

/** [[Proton]] or [[Neutron]], particles of the nucleus. */
trait Nucleon extends ParticlePrimary

/** the Neutron */
class Neutron extends Nucleon
{ override def radius: Length = 0.8e-3.picoMetres
  override def colour: Colour = DarkRed
  override val charge = 0
}

/** the Proton */
class Proton extends Nucleon
{ override def radius: Length = 0.8e-3.picoMetres
  override def colour: Colour = LightGreen
  override def charge: Int = 1
}