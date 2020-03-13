import org.scalatest._

import my.anis.stuff.models._

class ExampleSpec extends FlatSpec with Matchers {

  "A Car" should "have wheel plus 2" in {
    val car = new Car(10)
    car.myWheels should be (12)
  }

}