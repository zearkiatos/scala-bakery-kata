package pedrocapriles.scala_bakery_kata

import org.scalatest._
import org.scalatest.Matchers._

final class ScalaBakeryKataTest extends WordSpec with GivenWhenThen {
  "ScalaBakeryKata" should {
    "greet" in {
      Given("a ScalaBakeryKata")

      val scalaBakeryKata = new ScalaBakeryKata

      When("we ask him to greet someone")

      val nameToGreet = "CodelyTV"
      val greeting = scalaBakeryKata.greet(nameToGreet)

      Then("it should say hello to someone")

      greeting shouldBe "Hello " + nameToGreet
    }
  }
}
