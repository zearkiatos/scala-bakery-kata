package pedrocapriles.scala_bakery_kata

sealed trait BakeryState

case object Furralleros extends BakeryState
case object NotSoFurralleros extends BakeryState
case object JustInCase extends BakeryState
object BakeryHelper {
  def getCalories(bakeryState: BakeryState): Map[String, Int] = bakeryState match {
    case Furralleros => Map("min" -> 5000, "max" -> 10000)
    case NotSoFurralleros => Map("min" -> 1000, "max" -> 5000)
    case JustInCase => Map("min" -> 0, "max" -> 1000)
  }

  def getForcefulness(bakeryState: BakeryState): Int = bakeryState match {
    case Furralleros => 90
    case NotSoFurralleros => 50
    case JustInCase => 0
  }
}


