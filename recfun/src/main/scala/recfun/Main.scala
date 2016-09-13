package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int =
      if (c == 0 || r == c) 1
      else pascal(c, r-1) + pascal(c-1, r-1)
  
  /**
   * Exercise 2
   */
    var unbalancedBrackets = 0
    def balance(chars: List[Char]): Boolean = {
      if (chars.isEmpty) true
      else if (chars.head == '(') {
        unbalancedBrackets = unbalancedBrackets + 1
        balance(chars.tail)
        }
      else if (chars.head == ')')
        if (unbalancedBrackets > 0) {
        unbalancedBrackets = unbalancedBrackets - 1
        balance(chars.tail)
        }
        else false
      else balance(chars.tail)
  }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {

      def removeMoney(moneyLeft: Int, coinsLeft: List[Int]):Int =
       if (moneyLeft == 0) 1
       else if (moneyLeft < 0) 0
       else if (coinsLeft.isEmpty) 0
       else removeMoney(moneyLeft, coinsLeft.tail) + removeMoney(moneyLeft - coinsLeft.head, coinsLeft)

      removeMoney(money, coins)
    }
  }
