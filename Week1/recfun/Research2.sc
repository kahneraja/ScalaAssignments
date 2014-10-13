object Research2 {

	def sumInt(a: Int, b: Int): Int =
		if (a > b)
			0
		else
			a + sumInt(a + 1, b)      //> sumInt: (a: Int, b: Int)Int
	
	sumInt(1,4)                               //> res0: Int = 10
	
	def id(x: Int): Int = x                   //> id: (x: Int)Int
	def cube(x: Int): Int = x * x * x         //> cube: (x: Int)Int
	def factorial(x: Int): Int =	if (x == 0)	1 else x * factorial(x - 1)
                                                  //> factorial: (x: Int)Int

	
	def sumCubes(a: Int, b: Int): Int =
		if (a > b)
			0
		else
			cube(a) + sumCubes(a + 1, b)
                                                  //> sumCubes: (a: Int, b: Int)Int

	sumCubes(1,5)                             //> res1: Int = 225

	def sumFactorials(a: Int, b: Int): Int =
		if (a > b)
			0
		else
			factorial(a) + sumFactorials(a + 1, b)
                                                  //> sumFactorials: (a: Int, b: Int)Int
			
	sumFactorials(1,3)                        //> res2: Int = 9
	
	// here we have 3 separate functions that share a similiar expression. how do we reuse that?
	
	def complexSum(f: Int => Int, a: Int, b: Int): Int =
		if (a > b)
			0
		else
			f(a) + complexSum(f, a+1, b)
                                                  //> complexSum: (f: Int => Int, a: Int, b: Int)Int
  
  // this now allows us to generalise the process of sumation whilst retaining a separation of unique computation.
   
	
	complexSum(id, 1, 3)                      //> res3: Int = 6
	complexSum(cube, 1, 3)                    //> res4: Int = 36
	complexSum(factorial, 1,3)                //> res5: Int = 9
	
	
	// we can simplify with anonymouse functions. this is a shorter way of writing sumInt(...).
	complexSum((x: Int) => x, 1,3)            //> res6: Int = 6
	complexSum({(x: Int) => x * x * x} , 1,3) //> res7: Int = 36
	
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
	}                                         //> complexSum2: (f: Int => Int, a: Int, b: Int)Int
	
	complexSum2((x:Int) => x, 1,3)            //> res8: Int = 6
	complexSum2((x:Int) => x * x * x, 1,3)    //> res9: Int = 36
}