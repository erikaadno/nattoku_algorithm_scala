package chapter2

import org.scalatest.prop.TableDrivenPropertyChecks._
import org.scalatest.{FunSpec, Matchers}

class SelectionSortFunctionsSpec extends FunSpec with Matchers {

  val selectionSortFunctions = new SelectionSortFunctions()

  describe("selection sort test") {

    val testCases = Table(
      ("target", "expected"),
      (Seq(3, 2, 1), Seq(1, 2, 3)),
      (Seq(3, 2, 1, 5, 4), Seq(1, 2, 3, 4, 5)),
      (Seq(3, 2, 1, 5, 4, 55, 30, 20), Seq(1, 2, 3, 4, 5, 20, 30, 55)),
      (Seq(3, 2, 1, 5, 4, 55, 30, 20, -2),  Seq(-2, 1, 2, 3, 4, 5, 20, 30, 55))
    )
    forAll(testCases) { (target: Seq[Int], expected: Seq[Int]) =>
      selectionSortFunctions.selectionSort(target) should be(expected)
    }
  }
}
