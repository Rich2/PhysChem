/* Copyright 2018-24 Licensed under Apache Licence version 2.0. */
package ppart
import ostrat.*, geom.*, Colour.*, pgui.*

class Canv1(val canv: CanvasPlatform) extends CanvasNoPanels("Canv1")
{ //val title = "Coloured Circles"

  val output: RArr[CircleFill] = RArr(
    Circle(diameter = 100, cenX = 0, cenY = 0).fill(fillColour = SeaGreen),
    Circle(70, 50, 80).fill(Orange),
    Circle(80, 300, 0).fill(Red),
    Circle(80, -250, 150).fill(LemonLime),
    Circle(40, 0, -220).fill(DarkGoldenRod),
  )

  repaint(output)
}
