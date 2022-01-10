package pedrocapriles.scala_bakery_kata

import org.scalatest._
import org.scalatest.Matchers._
import pedrocapriles.scala_bakery_kata.BakeryType

final class BakeryTypeTest extends WordSpec with GivenWhenThen {
  "BakeryType" should {
    "return the calories range of a specific Bekery type" in {
      Given("a mock data")

      val bakeryMock = BakeryType.withName("Furralleros")
      val expectCalories = Map("min" -> 5000, "max" -> 10000)

      When("search the calories")

      val calories = BakeryType.getCalories(bakeryMock)

      Then("Return the calories range")

      calories shouldBe expectCalories
    }

    "return the forcefulness" in {
      Given("a mock data")

      val bakeryMock = BakeryType.withName("JustInCase")
      val expectForcefulness = 0

      When("search the forcefulness")

      val forcefulness = BakeryType.getForcefulness(bakeryMock)

      Then("Return the forcefulness")

      forcefulness shouldBe expectForcefulness
    }
  }
}
