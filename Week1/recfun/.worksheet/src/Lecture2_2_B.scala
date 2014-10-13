object Lecture2_2_B {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(212); 

	// lets rewrite sum so it returns a function. wtf!?
	
	def sum(f: Int => Int): (Int, Int) => Int = {
		def sumF(a: Int, b: Int): Int =
			if (a > b) 0
			else f(a) + sumF(a+1, b)
		sumF
	};System.out.println("""sum: (f: Int => Int)(Int, Int) => Int""");$skip(107); 
	
	// so now we can write another function that returns a function we can use.
	
	def sumInt = sum(x => x);System.out.println("""sumInt: => (Int, Int) => Int""");$skip(15); val res$0 = 
	
	sumInt(1,3);System.out.println("""res0: Int = """ + $show(res$0));$skip(67); 
	
	// how de avoid this sumInt() middle man?
	
	def id(x: Int) = x;System.out.println("""id: (x: Int)Int""");$skip(30); 
	def cube(x: Int) = x * x * x;System.out.println("""cube: (x: Int)Int""");$skip(7); val res$1 = 
	id(1);System.out.println("""res1: Int = """ + $show(res$1));$skip(143); val res$2 = 
	
	// sum : returns function
	// id: returns a funtion
	// (1,3) are parameters for the combinations of these two functions.
	
	sum (id) (1,3);System.out.println("""res2: Int = """ + $show(res$2));$skip(18); val res$3 = 
	sum (cube) (1,3);System.out.println("""res3: Int = """ + $show(res$3));$skip(310); val res$4 = 
	
	// this applies the sum funtion to the cube function and returns the sub of cubes.
	
	// sum(cube) is the same as sumCubes. the arguments are then applied once the function is resolved.
	
	// that was an example of functions return functions...
	
	// this is a valid expression in and of itself.
	sum(cube);System.out.println("""res4: (Int, Int) => Int = """ + $show(res$4))}
	
	// currying. this is a way of organising our functions and parameters so each function only every has one argument - and each argument is itself a function - with a single argument. a nested set of functions and arguments. this is call Currying.
	
	/*
		An example function
		def sum(f: Int => Int)(a: Int, b: Int): Int = ...
	
		What are the types returned?
		(Int => Int) => (Int, Int) Int
		
		This is equavalent to.
		(Int => Int) => ((Int, Int) Int)
		
		We can convert this into a currying approach.
		(Int => (Int => Int))
		
	*/
	
}
