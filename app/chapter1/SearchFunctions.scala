package chapter1

class SearchFunctions {

  def binarySearch(list: Seq[Int], target: Int): Option[Int] = {
    def loop(low: Int, high: Int): Option[Int] = {
      val midIndex: Int = (high + low) / 2
      list(midIndex) match {
        case i if i > target && high >= low => loop(low, midIndex - 1)
        case i if i < target && high >= low => loop(midIndex + 1, high)
        case i if i == target               => Some(midIndex)
        case _                              => None
      }
    }
    loop(0, list.length - 1)
  }
}
