package pedrocapriles.scala_bakery_kata

object BakeryType extends Enumeration {
  val Furralleros, NotSoFurralleros, JustInCase = Value

  def getCalories(bakeryType: BakeryType.Value): Map[String, Int] = bakeryType match {
    case BakeryType.Furralleros => Map("min" -> 5000, "max" -> 10000)
    case BakeryType.NotSoFurralleros => Map("min" -> 1000, "max" -> 5000)
    case BakeryType.JustInCase => Map("min" -> 0, "max" -> 1000)
  }

  def getForcefulness(bakeryType: BakeryType.Value): Int = bakeryType match {
    case BakeryType.Furralleros => 90
    case BakeryType.NotSoFurralleros => 50
    case BakeryType.JustInCase => 0
  }
}
