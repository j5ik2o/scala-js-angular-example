package scala.scalajs.js.angular

import scala.scalajs.js

trait Module extends js.Object {

  def animation(name: js.String, factory: js.Function): Module

  def animation(name: js.String, annotatedFunctions: js.Array[_]): Module

  def animation(obj: js.Object): Module

  def config(configFn: js.Function): Module

  def config(annotatedFunction: js.Array[_]): Module

  def constant(name: js.String, value: js.Any): Module

  def constant(obj: js.Object): Module

  def controller(name: js.String, factory: js.Function): Module

  def controller(name: js.String, annotatedConstructors: js.Array[_]): Module

  def controller(obj: js.Object): Module

  def directive(name: js.String, factory: js.Function): Module

  def directive(name: js.String, annotatedFunctions: js.Array[_]): Module

  def directive(obj: js.Object): Module

  def factory(name: js.String, serviceFactoryFunction: js.Function): Module

  def factory(name: js.String, annotatedFunctions: js.Array[_]): Module

  def factory(obj: js.Object): Module

  def filter(name: js.String, factory: js.Function): Module

  def filter(name: js.String, annotatedFunctions: js.Array[_]): Module

  def filter(obj: js.Object): Module

  def provider(name: js.String, serviceProviderConstructor: js.Function): Module

  def provider(name: js.String, annotatedConstructors: js.Array[_]): Module

  def provider(name: js.String, providerObject: Provider): Module

  def provider(obj: js.Object): Module

  def run(initializationFunction: js.Function): Module

  def run(inlineAnnotatedFunction: js.Array[_]): Module

  def service(name: js.String, serviceConstructor: js.Function): Module

  def service(name: js.String, annotatedConstructors: js.Array[_]): Module

  def service(obj: js.Object): Module

  def value(name: js.String, value: js.Any): Module

  def value(obj: js.Object): Module

  def name: js.String

  def requires: js.Array[js.String]

}
