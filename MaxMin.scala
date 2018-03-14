  def angryChildren(k: Int, arr: Array[Int]): Int = {
    val sort = arr.sorted

    var min = -1

    for (i <- 0 to sort.length - k) {
      //      println(k + i - 1)
      //      println(i)

      if (min == -1) min = sort(i + k - 1) - sort(i)
      min = Math.min(sort(i + k - 1) - sort(i), min)
      //   println(min)
    }

    min

  }
