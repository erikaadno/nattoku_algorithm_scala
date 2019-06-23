package chapter2

class SelectionSortFunctions {
  def selectionSort(list: Seq[Int]): Seq[Int] = {
    def loop(acc: Seq[Int], sortingList: Seq[Int]): Seq[Int] = {
      sortingList match {
        case Nil => acc
        case _   =>
          val min = sortingList.min
          loop(acc :+ min, sortingList.filterNot(_ == min))
      }
    }
    loop(Nil, list)
  }
}
