  def minimumDistances(a: Array[Int]): Int = {

    var min = -1

    for (i <- 0 until a.length) {

      for (j <- i + 1 until a.length) {
        if (a(i) == a(j)) {
          val min2 = Math.abs(i - j)
          if (min != -1) {
            min = Math.min(min2, min)
          } else min = min2
        }
      }

    }

    min


  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var a = new Array[Int](n);
    for (a_i <- 0 to n - 1) {
      a(a_i) = sc.nextInt();
    }
    val result = minimumDistances(a);
    println(result)
  }
