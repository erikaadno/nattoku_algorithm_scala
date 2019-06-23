package chapter1

import org.scalatest.prop.TableDrivenPropertyChecks._
import org.scalatest.{FunSpec, Matchers}

class SearchFunctionsSpec extends FunSpec with Matchers  {

  val searchFunctions = new SearchFunctions()


  describe("BinarySearch test") {
    val testCases = Table(
      ("target", "expected"),
      (2, Some(1)),
      (4, Some(3)),
      (12, None)
    )
    val sortedList = Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    forAll(testCases) { (target: Int, expected: Option[Int]) =>
      searchFunctions.binarySearch(sortedList, target) should be(expected)
    }
  }
}