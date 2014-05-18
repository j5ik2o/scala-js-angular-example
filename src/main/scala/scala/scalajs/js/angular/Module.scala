package scala.scalajs.js.angular

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

trait Module extends js.Object {
   def provider(name: js.String, providerType: js.Function): Module = ???
   def factory(name: js.String, getFunction: js.Function): Module = ???
   def service(name: js.String, constructor: js.Function): Module = ???
   def value(name: js.String, value: js.Any): Module = ???
   def constant(name: js.String, value: js.Any): Module = ???
   def animation(name: js.String, factory: js.Function): Module = ???
   def filter(name: js.String, factory: js.Function0[js.Function1[js.String, js.String]]): Module = ???
   @JSName("controller") def controllerAsFactory(name: js.String, factory: js.Function): Module = ???
   @JSName("controller") def controllerAsAnnotatedConstructor(name: js.String, inlineAnnotatedConstructor: js.Array[js.Any]): Module = ???
   def directive(name: js.String, factory: js.Function): Module = ???
   def config(configFn: js.Function): Module = ???
   def run(runFn: js.Function): Module = ???
 }
