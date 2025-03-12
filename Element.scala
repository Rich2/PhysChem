/* Copyright 2025 Richard Oliver. Licensed under Apache Licence version 2.0. */
package ppart
import ostrat.*, Colour.*

class Element(val atomicNum: Int, val cpkColour: Colour)
object Hydrogen extends Element(1, White)

object Carbon extends Element(6, Black)
object Oxygen extends Element(8, Red)