package my.anis.stuff.helpers

import my.anis.stuff.models._

object Helpers {
    implicit class VehicleWithWheel(x: Vehicle) {
        def processMyWheel[A] (f: (Int) => A): A = {
            f(x.myWheels)
        }
    }
}