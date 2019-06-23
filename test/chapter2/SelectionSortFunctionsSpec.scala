package chapter2

import org.scalatest.{FunSpec, Matchers}

class SelectionSortFunctionsSpec extends FunSpec with Matchers {

  val selectionSortFunctions = new SelectionSortFunctions()

  describe("selection sort test") {
    it("elements: 3") {
      val expected = Seq(1, 2, 3)
      val target = Seq(3, 2, 1)
      val actual = selectionSortFunctions.selectionSort(target)
      actual should be(expected)
    }

    it("elements: 5") {
      val expected = Seq(1, 2, 3, 4, 5)
      val target = Seq(3, 2, 1, 5, 4)
      val actual = selectionSortFunctions.selectionSort(target)
      actual should be(expected)
    }

    it("elements: many") {
      val expected = Seq(1, 2, 3, 4, 5, 20, 30, 55)
      val target = Seq(3, 2, 1, 5, 4, 55, 30, 20)
      val actual = selectionSortFunctions.selectionSort(target)
      actual should be(expected)
    }

    it("elements: minus") {
      val expected = Seq(-2, 1, 2, 3, 4, 5, 20, 30, 55)
      val target = Seq(3, 2, 1, 5, 4, 55, 30, 20, -2)
      val actual = selectionSortFunctions.selectionSort(target)
      actual should be(expected)
    }
  }
}
