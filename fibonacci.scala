
//Nth place fibonacci by logic of 0 1 1 2 3 etc..

def fibonacci(x: Int): Int = {
  
  if (x > 2) fibonacci(x - 1) + fibonacci(x - 2) else x - 1
}


//tests

fibonacci(5) // 3
