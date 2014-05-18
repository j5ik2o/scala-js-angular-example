package scala.scalajs.js.angular

import scala.language.dynamics
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

trait Scope extends js.Object {

  @JSName("$apply") def $apply(): js.Any

  @JSName("$apply") def $apply(exp: js.String): js.Any

  @JSName("$apply") def $apply(exp: js.Function1[Scope, js.Any]): js.Any

}

