package example

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, JSExport}
import scala.scalajs.js.angular._

@JSExport
object Main {

  val module = angular.module("TestApp", Array.empty[String])
  val f: js.Function = {
    scope: js.Dynamic =>
      scope.test = "aaaa!"
  }
  module.controller("HelloWorldController", js.Array("$scope", f))

}
