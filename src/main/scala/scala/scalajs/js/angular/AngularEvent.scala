package scala.scalajs.js.angular

import scala.scalajs.js

trait AngularEvent {

  val targetScope: Scope

  val currentScope: Scope

  val name: js.String

  val preventDefault: js.Function

  val defaultPrevented: js.Boolean

  val stopPropagation: Option[js.Function]
}
