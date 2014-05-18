package example

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import scala.scalajs.js.angular._

@JSExport
object Main {

  val module = angular.module("TestApp", Array.empty[String])

  module.controller(
    "SimpleController",
    Array(
      "$scope", { scope: Scope with js.Dynamic =>
        scope.firstName = "John"
        scope.lastName = "Doe"
        scope.getFullName = { () =>
          scope.firstName + " " + scope.lastName;
        }: js.Function
      }: js.Function
    )
  )

}
