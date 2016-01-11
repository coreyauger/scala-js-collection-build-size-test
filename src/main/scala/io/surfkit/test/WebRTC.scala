package io.surfkit.test

import scala.concurrent.{Promise, Future}
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import scala.util.Try


object ConversantAppReact extends JSApp {


  override def main(): Unit = {

    org.scalajs.dom.window.alert("hello world !!")

    val maybe = Some(1)
    maybe.filter(_ == 1).map{ x =>
      org.scalajs.dom.window.console.log(x)
    }

    val p = Promise[Int]()
    val f:Future[Int] = p.future

    p.complete(Try(1))

    val jsArray = js.Array[Int](10, 9, 9, 7 , 6, 5, 4, 3, 2, 1)
    jsArray.zipWithIndex.foreach{
      case (v, ind) =>
        org.scalajs.dom.window.console.log(ind)
    }

    val a = List(1,2,3,4,5,6,7)
    //val b = Set(1, 2, 3, 4, 5)
    //val c = Seq(1, 2, 3, 4, 5)
    val d = Map(1 -> 2, 2 -> 3, 4 -> 4 )


    a.map(_ + 2).sum
    //b.map(_ + 2).sum
    //c.map(_ + 2).sum
    d.values.map(_ + 2).sum
  }



}

