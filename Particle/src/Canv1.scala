/* Copyright 2025 Richard Oliver. Licensed under Apache Licence version 2.0. */
package ppart
import ostrat.*, geom.*, Colour.*, pgui.*

class Canv1(val canv: CanvasPlatform) extends CanvasNoPanels("Canv1")
{ val scale = 0.01.angstroms
  val output = Water.fillDraws(scale) ++ Dihydrogen.fillDraws(scale, 0.picometres, 200.picometres)

    RArr(
    HAtom().fillDraw(scale, 100, 50),
    OAtom().fillDraw(scale),
    CAtom().fill(scale, -100)
  )

  repaint(output)
}
