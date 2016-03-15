package com.unicorncoding.aidlore.app

import javafx.application.Application
import javafx.event.{ActionEvent, EventHandler}
import javafx.scene.Scene
import javafx.scene.control.{Button, Label}
import javafx.scene.image.{Image, ImageView}
import javafx.scene.layout.VBox
import javafx.stage.Stage

sealed trait ApplicationControlAction

case object About extends ApplicationControlAction

case object NewFile extends ApplicationControlAction

case object OpenFile extends ApplicationControlAction

case object ShowPreferences extends ApplicationControlAction

case object Exit extends ApplicationControlAction

/**
  * Normally ignored in correctly deployed JavaFX application.
  * But on Mac OS, this method seems to be called by the javafx launcher.
  */
object AidLoreApp {
  def main(args: Array[String]) {
    Application launch(classOf[AidLoreApp], args: _*)
  }
}

class AidLoreApp extends Application {

//  val windowList: util.List[DocumentWindowController] = new util.ArrayList[DocumentWindowController]
//  //  var windowList: List[DocumentWindowController] = util.ArrayList[DocumentWindowController]
//  val aboutWindowController: AboutWindowController = new AboutWindowController
//  val preferencesWindowController: PreferencesWindowController = new PreferencesWindowController

  /**
    *
    * demo purpose only!
    *
    */
  def start(stage: Stage) {

    val root = new VBox

    val hello = new Label("JavaFX w/ Scala! 8)")
    val button = new Button("Click me")
    button.setGraphic(new ImageView(new Image(getClass.getResourceAsStream("arrow.png"))))
    val thankYou = new Label

    button setOnAction new EventHandler[ActionEvent] {
      def handle(event: ActionEvent) {
        thankYou.setText("Thank you!")
      }
    }

    root.getChildren addAll(hello, button, thankYou)

    val scene = new Scene(root, 800, 600)
    stage.setScene(scene)
    stage.show()
  }
}