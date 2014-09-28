object Research {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 
  def factorial(x: Int): Int =
    if (x == 0) 1 else x * factorial(x - 1);System.out.println("""factorial: (x: Int)Int""");$skip(67); 

  def fTailProduct(x: Int, next: Int): Int =
    x * fTail(next);System.out.println("""fTailProduct: (x: Int, next: Int)Int""");$skip(75); 

  def fTail(x: Int): Int =
    if (x == 0) 1 else fTailProduct(x, x - 1);System.out.println("""fTail: (x: Int)Int""");$skip(17); val res$0 = 

  factorial(5);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
  factorial(1);System.out.println("""res1: Int = """ + $show(res$1));$skip(15); val res$2 = 
  factorial(2);System.out.println("""res2: Int = """ + $show(res$2));$skip(15); val res$3 = 
  factorial(3);System.out.println("""res3: Int = """ + $show(res$3));$skip(91); 

  def filter(chars: List[Char]): List[Char] = chars.filter { e => e == '(' || e == ')' };System.out.println("""filter: (chars: List[Char])List[Char]""");$skip(424); 

  def balance(chars: List[Char]): Boolean = {
    def counter(chars: List[Char], openCount: Int): Int =
      if (chars.isEmpty || openCount < 0)
        openCount
      else if (chars.head == '(')
        counter(chars.tail, openCount + 1)
      else if (chars.head == ')')
        counter(chars.tail, openCount - 1)
      else
        counter(chars.tail, openCount)

    if (counter(chars, 0) == 0) true else false
  };System.out.println("""balance: (chars: List[Char])Boolean""");$skip(30); val res$4 = 

  balance("a(b)c d".toList);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(26); val res$5 = 
  balance("a(bcd".toList);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(23); val res$6 = 
  balance(")(".toList);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(25); val res$7 = 
  balance("())(".toList);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(22); val res$8 = 
  balance(")".toList);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(23); val res$9 = 
  balance("()".toList);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(40); val res$10 = 
  balance("(....(((((...))))))".toList);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(25); val res$11 = 
  balance("(())".toList);System.out.println("""res11: Boolean = """ + $show(res$11));$skip(332); 


	
	
	
	
	
	
	
	
	
	def countChange(money: Int, coins: List[Int]): Int = {
		
		def iter(balance: Int, coins: List[Int]): Int =
			if (coins.isEmpty || balance > money)
				0 // overflow
			else if (balance == money)
				1 // match!
			else
				iter(balance + coins.head, coins) + iter(balance, coins.tail)
		
		iter(0,  coins)
	};System.out.println("""countChange: (money: Int, coins: List[Int])Int""");$skip(34); val res$12 = 
		
  
  countChange(1, List(1));System.out.println("""res12: Int = """ + $show(res$12));$skip(26); val res$13 = 
  countChange(2, List(1));System.out.println("""res13: Int = """ + $show(res$13));$skip(30); val res$14 = 
  countChange(4, List(1,2,4));System.out.println("""res14: Int = """ + $show(res$14));$skip(30); val res$15 = 
  countChange(4, List(5,2,4));System.out.println("""res15: Int = """ + $show(res$15));$skip(48); val res$16 = 
  countChange(300,List(5,10,20,50,100,200,500));System.out.println("""res16: Int = """ + $show(res$16))}
  
  
}
