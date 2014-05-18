package scala.scalajs.js.angular

import scala.language.dynamics
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

trait Scope extends js.Object {

  def $apply(): js.Any

  def $apply(exp: js.String): js.Any

  def $apply(exp: js.Function1[Scope, js.Any]): js.Any

  def $broadcast(name: js.String, args: js.Array[_]*): AngularEvent

  def $destroy(): Unit

  def $digest(): Unit

  def $emit(name: js.String, args: js.Array[_]*): AngularEvent

  def $eval(expression: js.String, args: js.Object): js.Any

  def $eval(expression: js.String): js.Any

  def $eval(expression: js.Function1[Scope, _], args: js.Object): js.Any

  def $eval(expression: js.Function1[Scope, _]): js.Any

  def $evalAsync(expression: js.String): Unit

  def $evalAsync(expression: js.Function1[Scope, _]): Unit

  def $new(isolate: Boolean): Scope

  def $new(): Scope

  def $on(name: js.String, listener: js.Function2[AngularEvent, js.Array[_], _]): js.Function

  def $watch(watchExpression: js.String, listener: js.String, objectEquality: js.Boolean): js.Function

  def $watch(watchExpression: js.String, listener: js.String): js.Function

  def $watch(watchExpression: js.String): js.Function

  def $watch(watchExpression: js.String, listener: js.Function3[_, _, Scope, _], objectEquality: js.Boolean): js.Function

  def $watch(watchExpression: js.String, listener: js.Function3[_, _, Scope, _]): js.Function

  def $watch(watchExpression: js.Function1[Scope, _], listener: js.String, objectEquality: js.Boolean): js.Function

  def $watch(watchExpression: js.Function1[Scope, _], listener: js.String): js.Function

  def $watch(watchExpression: js.Function1[Scope, _]): js.Function

  def $watch(watchExpression: js.Function1[Scope, _], listener: js.Function3[_, _, Scope, _], objectEquality: js.Boolean): js.Function

  def $watch(watchExpression: js.Function1[Scope, _], listener: js.Function3[_, _, Scope, _]): js.Function

  def $watchCollection(watchExpression: js.String, listener: js.Function3[_, _, Scope, _]): js.Function;

  def $watchCollection(watchExpression: js.Function1[Scope, _], listener: js.Function3[_, _, Scope, _]): js.Function;

  def $parent: Scope

  def $id: js.String

  def $$isolateBindings: js.Any

  def $$phase: js.Any;

}

