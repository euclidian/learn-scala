package my.anis.stuff.models

class Vehicle(val wheels: Int) {
    val myWheels: Int = wheels + 1

    def printWheels() {
        println("Wheels: " + myWheels)
        println("Wheels: " + wheels)
    }
}