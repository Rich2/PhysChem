/* Copyright 25 Licensed under Apache Licence version 2.0. */
package ppart
import ostrat.*, geom.*, Colour.*, pgui.*

class Canv1(val canv: CanvasPlatform) extends CanvasNoPanels("Canv1")
{ val scale = 0.01.angstroms
  val output: RArr[CircleGraphic] = RArr(
    HAtom().fillDraw(scale, 100, 50),
    OAtom().fillDraw(scale),
    CAtom().fill(scale, -100)
  )

  repaint(output)
}
