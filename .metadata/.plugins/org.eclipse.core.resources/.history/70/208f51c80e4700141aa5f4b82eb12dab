package recfun
import common._

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
  def pascal(c: Int, r: Int): Int = {
      def isEdge : Boolean = (c == 0 || c == r)
	  def parentSum(c: Int, r: Int): Int = pascal(c-1, r-1) + pascal(c, r-1)
  	if (isEdge) 1 else parentSum(c, r)
  }   

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def counter(chars: List[Char], openCount:Int): Int =
  	if (chars.isEmpty || openCount < 0)
  		openCount
  	else
  		if (chars.head == '(')
  			counter(chars.tail, openCount + 1)
  		else if (chars.head == ')')
  		  counter(chars.tail, openCount - 1)
			else
				counter(chars.tail, openCount)
				
  		if (counter(chars, 0) == 0) true else false
  } 

  /**
   * Exercise 3
   */
	def countChange(money: Int, coins: List[Int]): Int = {
		
		def iter(balance: Int, coins: List[Int]): Int =
			if (coins.isEmpty || balance > money)
				0 // overflow
			else if (balance == money)
				1 // match!
			else
				iter(balance + coins.head, coins) + iter(balance, coins.tail)
		
		iter(0,  coins)
	}

}
