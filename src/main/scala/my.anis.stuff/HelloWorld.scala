package my.anis.stuff

import models._
import helpers.Helpers._

object HelloWorld {
    def main(args: Array[String]) {
      val car = new Car(10)
      println(car.processMyWheel(timesTen))
      car.printWheels()
      println("Hello, world!")
    }

    def timesTen(x:Int) : Int = {
      return x * 10
    }
}
