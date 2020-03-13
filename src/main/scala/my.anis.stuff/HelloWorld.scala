package my.anis.stuff

import models._

object HelloWorld {
    def main(args: Array[String]) {
      val car = new Car(10)
      car.printWheels()
      println("Hello, world!")
    }
}