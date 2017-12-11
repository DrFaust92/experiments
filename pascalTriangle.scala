//recursive factorial function

def factorial(x: Int): Int = {

  if (x > 1) factorial(x - 1) * x else 1
}


//newtons binomial
def binomial(x: Int, y: Int): Int = {
  factorial(x) / (factorial(y) * factorial(x - y))
}


def pascal(level: Int):Unit = {
  for (row <- 0 until level) {
    for (col <- 0 to row)
      print(binomial(row, col))
    println()
  }
}


pascal(10)


//1
//11
//121
//1331
//14641
//15101051
//1615201561
//172135352171
//18285670562881
//193684126126843691
