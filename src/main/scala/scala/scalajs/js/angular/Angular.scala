package scala.scalajs.js.angular

import org.scalajs.jquery.JQuery
import scala.scalajs.js
import org.scalajs.dom

trait Angular extends js.Object {

  def bind(context: js.Any, fn: js.Function, args: js.Any*): js.Function

  def bootstrap(element: js.String, modules: js.Array[_]): Injector

  def bootstrap(element: js.String): Injector

  def bootstrap(element: JQuery, modules: js.Array[_]): Injector

  def bootstrap(element: JQuery): Injector

  def bootstrap(element: dom.Document, modules: js.Array[_]): Injector

  def bootstrap(element: dom.Document): Injector

  def bootstrap(element: dom.Element, modules: js.Array[_]): Injector

  def bootstrap(element: dom.Element): Injector

  def copy[T <: js.Any](source: T, destination: T = null): T

  def element: JQuery

  def equals(o1: js.Any, o2:js.Any): js.Boolean

  def extend(dst: js.Object, src: js.Object*): js.Object

  def forEach(obj: js.Object, iterator: js.Function, context: js.Object = null): js.Object

  def fromJson(json: js.String): js.Any

  def identity[T <: js.Any](value: T): T

  def injector(modules: js.Array[_] = null): Injector

  def isArray(value: js.Any): js.Boolean

  def isDate(value: js.Any): js.Boolean

  def isDefined(value: js.Any): js.Boolean

  def isElement(value: js.Any): js.Boolean

  def isFunction(value: js.Any): js.Boolean

  def isNumber(value: js.Any): js.Boolean

  def isObject(value: js.Any): js.Boolean

  def isString(value: js.Any): js.Boolean

  def isUndefined(value: js.Any): js.Boolean

  def lowercase(str: js.String): js.String

  def module(name: js.String, requires: js.Array[String] = null, configFn: js.Function = null): Module

  def noop(args: js.Array[js.Any]*): Unit

  def noop(): Unit

  def toJson(obj: js.Any, pretty: js.Boolean = null): js.String

  def uppercase(string: js.String): js.String

  def version: Version

}


