object Research2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(103); 

	def sumInt(a: Int, b: Int): Int =
		if (a > b)
			0
		else
			a + sumInt(a + 1, b);System.out.println("""sumInt: (a: Int, b: Int)Int""");$skip(15); val res$0 = 
	
	sumInt(1,4);System.out.println("""res0: Int = """ + $show(res$0));$skip(27); 
	
	def id(x: Int): Int = x;System.out.println("""id: (x: Int)Int""");$skip(35); 
	def cube(x: Int): Int = x * x * x;System.out.println("""cube: (x: Int)Int""");$skip(70); 
	def factorial(x: Int): Int =	if (x == 0)	1 else x * factorial(x - 1);System.out.println("""factorial: (x: Int)Int""");$skip(97); 

	
	def sumCubes(a: Int, b: Int): Int =
		if (a > b)
			0
		else
			cube(a) + sumCubes(a + 1, b);System.out.println("""sumCubes: (a: Int, b: Int)Int""");$skip(16); val res$1 = 

	sumCubes(1,5);System.out.println("""res1: Int = """ + $show(res$1));$skip(110); 

	def sumFactorials(a: Int, b: Int): Int =
		if (a > b)
			0
		else
			factorial(a) + sumFactorials(a + 1, b);System.out.println("""sumFactorials: (a: Int, b: Int)Int""");$skip(24); val res$2 = 
			
	sumFactorials(1,3);System.out.println("""res2: Int = """ + $show(res$2));$skip(209); 
	
	// here we have 3 separate functions that share a similiar expression. how do we reuse that?
	
	def complexSum(f: Int => Int, a: Int, b: Int): Int =
		if (a > b)
			0
		else
			f(a) + complexSum(f, a+1, b);System.out.println("""complexSum: (f: Int => Int, a: Int, b: Int)Int""");$skip(147); val res$3 = 
  
  // this now allows us to generalise the process of sumation whilst retaining a separation of unique computation.
   
	
	complexSum(id, 1, 3);System.out.println("""res3: Int = """ + $show(res$3));$skip(24); val res$4 = 
	complexSum(cube, 1, 3);System.out.println("""res4: Int = """ + $show(res$4));$skip(28); val res$5 = 
	complexSum(factorial, 1,3);System.out.println("""res5: Int = """ + $show(res$5));$skip(129); val res$6 = 
	
	
	// we can simplify with anonymouse functions. this is a shorter way of writing sumInt(...).
	complexSum((x: Int) => x, 1,3);System.out.println("""res6: Int = """ + $show(res$6));$skip(43); val res$7 = 
	complexSum({(x: Int) => x * x * x} , 1,3);System.out.println("""res7: Int = """ + $show(res$7));$skip(336); 
	
	/*
		linear recursion. tail recursion.
		the problem with complexSum is that it can blow the stack.
		let's try to write one that implements tail recursion.
	*/
	
	def complexSum2(f: Int => Int, a: Int, b: Int): Int = {
		def loop(x: Int, acc: Int): Int =
			if (x > b)
				acc
			else
				loop(x + 1, acc + f(x))
		
		loop(a, 0)
	};System.out.println("""complexSum2: (f: Int => Int, a: Int, b: Int)Int""");$skip(34); val res$8 = 
	
	complexSum2((x:Int) => x, 1,3);System.out.println("""res8: Int = """ + $show(res$8));$skip(40); val res$9 = 
	complexSum2((x:Int) => x * x * x, 1,3);System.out.println("""res9: Int = """ + $show(res$9))}
}
