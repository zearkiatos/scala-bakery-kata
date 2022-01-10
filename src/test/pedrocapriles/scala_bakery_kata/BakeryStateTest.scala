package pedrocapriles.scala_bakery_kata

import org.scalatest._
import org.scalatest.Matchers._
import pedrocapriles.scala_bakery_kata.{Furralleros, BakeryState, NotSoFurralleros, JustInCase, BakeryHelper}

final class BakeryStateTest extends WordSpec with GivenWhenThen {
  "BakeryState" should {
    "return the calories range of a specific Bekery state" in {
      Given("a mock data")

      val bakeryMock = Furralleros
      val expectCalories = Map("min" -> 5000, "max" -> 10000)

      When("search the calories")

      val calories = BakeryHelper.getCalories(bakeryMock)

      Then("Return the calories range")

      calories shouldBe expectCalories
    }

    "return the forcefulness" in {
      Given("a mock data")

      val bakeryMock = JustInCase
      val expectForcefulness = 0

      When("search the forcefulness")

      val forcefulness = BakeryHelper.getForcefulness(bakeryMock)

      Then("Return the forcefulness")

      forcefulness shouldBe expectForcefulness
    }
  }
}
