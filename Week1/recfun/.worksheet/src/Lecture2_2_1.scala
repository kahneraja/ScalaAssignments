object Lecture2_2_1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(315); 
	/*
	
	Currying: format for writing higher order functions.
	
	*/
	
	// standard higher order function.
	def sum(f: Int => Int, a: Int, b: Int): Int = {
		def loop(x: Int, acc: Int): Int = {
			println("x: " + x)
			if (x > b)
				acc
			else
				loop(x + 1, acc + f(x))
		}
		
		loop(a, 0)
	};System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(56); 
	
	def sumInt(a: Int, b: Int) = sum((x:Int) => x, a, b);System.out.println("""sumInt: (a: Int, b: Int)Int""");$skip(63); 
	def sumCubes(a: Int, b: Int) = sum((x:Int) => x * x * x, a,b);System.out.println("""sumCubes: (a: Int, b: Int)Int""");$skip(15); val res$0 = 
	
	sumInt(1,3);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
	sumCubes(1,3);System.out.println("""res1: Int = """ + $show(res$1))}
	// this can be further improved. there is repeatition in the definition of the wrapper sum functions.
	 
}
