object Research {
  def factorial(x: Int): Int =
    if (x == 0) 1 else x * factorial(x - 1)       //> factorial: (x: Int)Int
  
  def fTailProduct(x: Int, next: Int): Int =
  	x * fTail(next)                           //> fTailProduct: (x: Int, next: Int)Int
  
  def fTail(x: Int): Int =
    if (x == 0) 1 else fTailProduct(x, x - 1)     //> fTail: (x: Int)Int

  factorial(5)                                    //> res0: Int = 120
  factorial(1)                                    //> res1: Int = 1
  factorial(2)                                    //> res2: Int = 2
  factorial(3)                                    //> res3: Int = 6
  
  def filter(chars: List[Char]): List[Char] = chars.filter{ e => e == '(' || e == ')'}
                                                  //> filter: (chars: List[Char])List[Char]
 

  
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
  }                                               //> balance: (chars: List[Char])Boolean
  		
  balance("a(b)c d".toList)                       //> res4: Boolean = true
  balance("a(bcd".toList)                         //> res5: Boolean = false
  balance(")(".toList)                            //> res6: Boolean = false
  balance("())(".toList)                          //> res7: Boolean = false
  balance(")".toList)                             //> res8: Boolean = false
  balance("()".toList)                            //> res9: Boolean = true
  balance("(....(((((...))))))".toList)           //> res10: Boolean = true
	balance("(())".toList)                    //> res11: Boolean = true
}