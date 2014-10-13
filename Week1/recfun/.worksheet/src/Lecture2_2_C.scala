object Lecture2_2_C {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(194); 
	def mapReduce(f: Int => Int, combine: (Int, Int) => Int, min: Int)(a: Int, b: Int): Int =
		if (a > b)
			min
		else
			combine(f(a), mapReduce(f, combine, min)(a + 1, b));System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, min: Int)(a: Int, b: Int)Int""");$skip(97); 
				

	def product(f: Int => Int)(a: Int, b:Int): Int =
		mapReduce(f, { (x,y) => x*y }, 1)(a,b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(40); 
	
	def sum(x: Int, y: Int): Int = x + y;System.out.println("""sum: (x: Int, y: Int)Int""");$skip(43); 
	def multiply(x: Int, y: Int): Int = x * y;System.out.println("""multiply: (x: Int, y: Int)Int""");$skip(22); 
	
	def id(x: Int) = x;System.out.println("""id: (x: Int)Int""");$skip(30); 
	def cube(x: Int) = x * x * x;System.out.println("""cube: (x: Int)Int""");$skip(28); 
	def square(x: Int) = x * x;System.out.println("""square: (x: Int)Int""");$skip(48); 
	def factorial(x: Int): Int = product(id)(1, x);System.out.println("""factorial: (x: Int)Int""");$skip(14); val res$0 = 
	factorial(5);System.out.println("""res0: Int = """ + $show(res$0));$skip(20); val res$1 = 
	
	product(id)(1,3);System.out.println("""res1: Int = """ + $show(res$1));$skip(21); val res$2 = 
	product(cube)(1,10);System.out.println("""res2: Int = """ + $show(res$2));$skip(38); val res$3 = 
	


	
	mapReduce(square, sum, 0)(3,4);System.out.println("""res3: Int = """ + $show(res$3));$skip(37); val res$4 = 
	mapReduce(square, multiply, 1)(3,4);System.out.println("""res4: Int = """ + $show(res$4))}
	
	// this illustrates currying. defining one function and argument after another.
	
}
