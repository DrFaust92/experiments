  def howManyGames(p: Int, d: Int, m: Int, s: Int): Int = {

    def loop(price: Int, left: Int, acc: Int): Int = {
      left match {
        case 0 => acc
        case l if l < price => acc
        case l if (price - d) > m => loop(price - d, l - price, acc + 1)
        case l => loop(m, l - price, acc + 1)
      }

    }

    loop(p, s, 0)
  }
