package scala.scalajs.js.angular

import scala.scalajs.js

trait Injector {

  def annotate(fn: js.Function): js.Array[js.String]

  def annotate(annotatedFunctions: js.Array[_]): js.Array[js.String]

  def get(name: js.String): js.Any

  def has(name: js.String): js.Boolean

  def instantiate(svcType: js.Function, locals: js.Object = js.Object()): js.Object

  def invoke(annotatedFunctions: js.Array[_]): js.Any

  def invoke(fn: js.Function, self: js.Object = js.Object(), locals: js.Object = js.Object()): js.Any

}
