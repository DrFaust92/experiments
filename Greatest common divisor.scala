def gcd(x: Int, y: Int): Int = {
  if (x == 0) y else gcd(y % x, x)
}


//tests
gcd(10, 45) //5
gcd(10,100) //10
