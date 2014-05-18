package scala.scalajs.js.angular

import org.scalajs.jquery.JQuery
import scala.scalajs.js
import org.scalajs.dom

trait Angular extends js.Object {
  def bind(context: js.Any, fn: js.Function, args: js.Any*): js.Function = ???

  def bootstrap(element: js.String, modules: js.Array[js.Any]): Injector = ???
  def bootstrap(element: js.String): Injector = ???
  def bootstrap(element: JQuery, modules: js.Array[js.Any]): Injector = ???
  def bootstrap(element: JQuery): Injector = ???
  def bootstrap(element: dom.Document, modules: js.Array[js.Any]): Injector = ???
  def bootstrap(element: dom.Document): Injector = ???
  def bootstrap(element: dom.Element, modules: js.Array[js.Any]): Injector = ???
  def bootstrap(element: dom.Element): Injector = ???

  def copy[T <: js.Any](source: T, destination: T = js.Object()): T = ???

  def element: JQuery = ???

  def equals(o1: js.Any, o2:js.Any): js.Boolean = ???

  def extend(dst: js.Object, src: js.Object*): js.Object = ???

  def forEach(obj: js.Object, iterator: js.Function, context: js.Object = js.Object()): js.Object = ??? // TODO: context is smelly

  def fromJson(json: js.String): js.Any = ???

  def identity[T <: js.Any](value: T): T = ???

  def injector(modules: js.Array[js.Any]): Injector = ???

  def isArray(value: js.Any): Boolean = ???
  def isDate(value: js.Any): Boolean = ???
  def isDefined(value: js.Any): Boolean = ???
  def isElement(value: js.Any): Boolean = ???
  def isFunction(value: js.Any): Boolean = ???
  def isNumber(value: js.Any): Boolean = ???
  def isObject(value: js.Any): Boolean = ???
  def isString(value: js.Any): Boolean = ???
  def isUndefined(value: js.Any): Boolean = ???
  def lowercase(str: js.String): js.String = ???

  def module(name: js.String, requires: js.Array[String], configFn: js.Function): Module = ???
  def module(name: js.String, requires: js.Array[String]): Module = ???
  def module(name: js.String): Module = ???

  def noop(args: js.Array[js.Any]*): Unit = ???
  def noop(): Unit = ???
  def toJson(obj: js.Any): js.String = ???
  def uppercase(string: js.String): js.String = ???
  val version: Version

}


