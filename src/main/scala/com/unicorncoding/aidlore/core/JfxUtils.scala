package com.unicorncoding.aidlore.core

import java.net.URL
import java.util.ResourceBundle
import javafx.fxml.FXMLLoader
import javafx.scene.Parent

object JfxUtils {

  /**
    * Given an fxml and a resource bundle, instantiate the corresponding controller.
    *
    * @param rb resourcebundle which contains the i18n strings
    * @param fxml the fxml classpath
    * @tparam T the controller type
    * @return a triple containing the initialized controller, a handle for the gui compenent and the used fxml loader
    */
  def instantiate[T](rb: ResourceBundle)(fxml: String): (T, Parent, FXMLLoader) = {
    val resource: URL = getClass.getResource(fxml)
    require(resource != null, s"Could not find $fxml resource.")
    val l = new FXMLLoader(resource)
    l.setResources(rb)
    val parent = l.load[Parent]
    assert(parent != null)
    val controller: T = l.getController[T]
    assert(controller != null, s"Controller was not set in fxml $fxml")
    (controller, parent, l)
  }
}
