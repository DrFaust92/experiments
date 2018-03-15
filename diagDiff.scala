  def diagonalDifference(a: Array[Array[Int]]): Int = {
    val n = a.length

    var diagLeft = 0
    var diagRight = 0

    for (i <- 0 until n) {

      val l = i
      val r = n - 1 - i

      diagLeft = a(i)(l) + diagLeft
      diagRight = a(i)(r) + diagRight
    }

    Math.abs(diagLeft - diagRight)

  }
