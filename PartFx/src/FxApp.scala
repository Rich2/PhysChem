 /* Copyright 2025 Richard Oliver. Licensed under Apache Licence version 2.0. */
package ppart
import ostrat.*, javafx.*, stage.*, scene.*, canvas.*

object FxApp
{
  def main(args: Array[String]): Unit = javafx.application.Application.launch(classOf[AppStart], args*)
}

class AppStart extends application.Application
{
  override def start(primaryStage: Stage): Unit =
  { val bounds = stage.Screen.getPrimary.getVisualBounds
    val canvWidth: Double = bounds.getWidth - 8
    val canvHeight: Double = bounds.getHeight
    val canvasCanvas: Canvas = new Canvas(canvWidth, canvHeight)
    val root = new Group()
    root.getChildren.add(canvasCanvas)
    primaryStage.setX(0)//Sets default x value
    val jScene = new Scene(root, canvWidth, canvHeight)
    primaryStage.setTitle("Particles")
    primaryStage.setScene(jScene)
    primaryStage.show
  }
}