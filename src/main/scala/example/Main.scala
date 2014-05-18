package example

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import scala.scalajs.js.angular._

@JSExport
object Main {

  val module = angular.module("TestApp", Array.empty[String])

  val f: js.Function = {
    scope: Scope with js.Dynamic =>
      scope.firstName = "John"
      scope.lastName = "Doe"
      scope.fullName = { () =>
        scope.firstName + " " + scope.lastName;
      }: js.Function
  }

  module.controller("SimpleController", js.Array("$scope", f))

}
