object Lecture2_2_C {
	def mapReduce(f: Int => Int, combine: (Int, Int) => Int, min: Int)(a: Int, b: Int): Int =
		if (a > b)
			min
		else
			combine(f(a), mapReduce(f, combine, min)(a + 1, b))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, min: Int)(a: Int, b: 
                                                  //| Int)Int
				

	def product(f: Int => Int)(a: Int, b:Int): Int =
		mapReduce(f, { (x,y) => x*y }, 1)(a,b)
                                                  //> product: (f: Int => Int)(a: Int, b: Int)Int
	
	def sum(x: Int, y: Int): Int = x + y      //> sum: (x: Int, y: Int)Int
	def multiply(x: Int, y: Int): Int = x * y //> multiply: (x: Int, y: Int)Int
	
	def id(x: Int) = x                        //> id: (x: Int)Int
	def cube(x: Int) = x * x * x              //> cube: (x: Int)Int
	def square(x: Int) = x * x                //> square: (x: Int)Int
	def factorial(x: Int): Int = product(id)(1, x)
                                                  //> factorial: (x: Int)Int
	factorial(5)                              //> res0: Int = 120
	
	product(id)(1,3)                          //> res1: Int = 6
	product(cube)(1,10)                       //> res2: Int = 520093696
	


	
	mapReduce(square, sum, 0)(3,4)            //> res3: Int = 25
	mapReduce(square, multiply, 1)(3,4)       //> res4: Int = 144
	
	// this illustrates currying. defining one function and argument after another.
	
}