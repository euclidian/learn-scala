package my.anis.stuff.models

import my.anis.stuff.helpers.Helpers._

class Vehicle(val wheels: Int) {
    val myWheels: Int = wheels + 1

    def printWheels() {
        this.processMyWheel(println)
    }
}
