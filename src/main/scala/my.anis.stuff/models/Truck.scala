package my.anis.stuff.models

class Truck(override val wheels: Int) extends Vehicle(wheels){
    override val myWheels: Int = wheels + 2
}
