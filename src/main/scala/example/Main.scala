package example

import scala.scalajs.js
import js.annotation.JSExport
import org.scalajs.dom
import scala.scalajs.js.angular._

@JSExport
object Main {

    val module = angular.module("TestApp", Array.empty[String])
    val f: js.Function = {
        scope: js.Dynamic =>
          scope.test = "aaaa!"
        }
    module.controllerAsAnnotatedConstructor("HelloWorldController", js.Array("$scope", f))

}
