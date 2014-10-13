object Lecture2_2_A {
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
	}                                         //> sum: (f: Int => Int, a: Int, b: Int)Int
	
	def sumInt(a: Int, b: Int) = sum((x:Int) => x, a, b)
                                                  //> sumInt: (a: Int, b: Int)Int
	def sumCubes(a: Int, b: Int) = sum((x:Int) => x * x * x, a,b)
                                                  //> sumCubes: (a: Int, b: Int)Int
	
	sumInt(1,3)                               //> x: 1
                                                  //| x: 2
                                                  //| x: 3
                                                  //| x: 4
                                                  //| res0: Int = 6
	sumCubes(1,3)                             //> x: 1
                                                  //| x: 2
                                                  //| x: 3
                                                  //| x: 4
                                                  //| res1: Int = 36
	// this can be further improved. there is repeatition in the definition of the wrapper sum functions.
	 
}