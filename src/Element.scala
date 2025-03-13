/* Copyright 2025 Richard Oliver. Licensed under Apache Licence version 2.0. */
package ppart
import ostrat.*, Colour.*

abstract class Element(val name: String, val abrev: String)
{ val atomicNum: Int
  def cpkColour: Colour
  override def toString: String = name + "Atom"
}

class Atom(val element: Element)
{ override def toString: String = element.abrev + "-" + "atom"
}

object Hydrogen extends Element("Hydrogen", "H")
{ override val atomicNum: Int = 1
  override val cpkColour: Colour =  White
}

class HAtom extends Atom(Hydrogen)

object Carbon extends Element("Carbon", "C")
{ override val atomicNum: Int = 6
  override val cpkColour: Colour = Black
}

class CAtom extends Atom(Carbon)

object Oxygen extends Element("Oxygen", "O")
{ override val atomicNum: Int = 8
  override val cpkColour: Colour = Red
}

class OAtom extends Atom(Oxygen)