package my.anis.stuff.models

class Car(override val wheels: Int) extends Vehicle(wheels){
    override val myWheels: Int = wheels + 2
}