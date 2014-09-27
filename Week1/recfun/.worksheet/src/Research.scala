object Research {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(92); 
  def factorial(x: Int): Int =
    if (x == 0) 1 else x * factorial(x - 1);System.out.println("""factorial: (x: Int)Int""");$skip(68); 
  
  def fTailProduct(x: Int, next: Int): Int =
  	x * fTail(next);System.out.println("""fTailProduct: (x: Int, next: Int)Int""");$skip(77); 
  
  def fTail(x: Int): Int =
    if (x == 0) 1 else fTailProduct(x, x - 1);System.out.println("""fTail: (x: Int)Int""");$skip(17); val res$0 = 

  factorial(5);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
  factorial(1);System.out.println("""res1: Int = """ + $show(res$1));$skip(15); val res$2 = 
  factorial(2);System.out.println("""res2: Int = """ + $show(res$2));$skip(15); val res$3 = 
  factorial(3);System.out.println("""res3: Int = """ + $show(res$3));$skip(90); 
  
  def filter(chars: List[Char]): List[Char] = chars.filter{ e => e == '(' || e == ')'};System.out.println("""filter: (chars: List[Char])List[Char]""");$skip(410); 
 

  
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
  };System.out.println("""balance: (chars: List[Char])Boolean""");$skip(33); val res$4 = 
  		
  balance("a(b)c d".toList);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(26); val res$5 = 
  balance("a(bcd".toList);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(23); val res$6 = 
  balance(")(".toList);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(25); val res$7 = 
  balance("())(".toList);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(22); val res$8 = 
  balance(")".toList);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(23); val res$9 = 
  balance("()".toList);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(40); val res$10 = 
  balance("(....(((((...))))))".toList);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(24); val res$11 = 
	balance("(())".toList);System.out.println("""res11: Boolean = """ + $show(res$11))}
}
