
//n - upper limit
//list - divisors
// sum of 1 < N < n that are can be divided by at least on number in list

def sumOfMulti(n:Int,list: List[Int])={
  (1 until n).foldLeft(0)((r, c) =>   if (list.map(s=> c % s == 0).foldLeft(false)(_ || _)) r + c else r + 0)
}
