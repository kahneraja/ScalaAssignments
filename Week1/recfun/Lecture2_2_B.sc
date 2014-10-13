object Lecture2_2_B {

	// lets rewrite sum so it returns a function. wtf!?
	
	def sum(f: Int => Int): (Int, Int) => Int = {
		def sumF(a: Int, b: Int): Int =
			if (a > b) 0
			else f(a) + sumF(a+1, b)
		sumF
	}                                         //> sum: (f: Int => Int)(Int, Int) => Int
	
	// so now we can write another function that returns a function we can use.
	
	def sumInt = sum(x => x)                  //> sumInt: => (Int, Int) => Int
	
	sumInt(1,3)                               //> res0: Int = 6
	
	// how de avoid this sumInt() middle man?
	
	def id(x: Int) = x                        //> id: (x: Int)Int
	def cube(x: Int) = x * x * x              //> cube: (x: Int)Int
	id(1)                                     //> res1: Int = 1
	
	// sum : returns function
	// id: returns a funtion
	// (1,3) are parameters for the combinations of these two functions.
	
	sum (id) (1,3)                            //> res2: Int = 6
	sum (cube) (1,3)                          //> res3: Int = 36
	
	// this applies the sum funtion to the cube function and returns the sub of cubes.
	
	// sum(cube) is the same as sumCubes. the arguments are then applied once the function is resolved.
	
	// that was an example of functions return functions...
	
	// this is a valid expression in and of itself.
	sum(cube)                                 //> res4: (Int, Int) => Int = <function2>
	
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