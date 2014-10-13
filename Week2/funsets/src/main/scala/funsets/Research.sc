package funsets

object Research {
  def sumRange(x: Int, y: Int): Int =
  	if (x == y)
  		x;
  	else if (x < y)
  		x + sumRange(x + 1, y)
  	else
  		y + sumRange(y + 1, x)            //> sumRange: (x: Int, y: Int)Int
  		
  		
  sumRange(1,2)                                   //> res0: Int = 3
  sumRange(1,1)                                   //> res1: Int = 1
 
  sumRange(1,5)                                   //> res2: Int = 15
  sumRange(-1, 1)                                 //> res3: Int = 0
  sumRange(-2, 0)                                 //> res4: Int = -3
  
  
  def formatPair(f: (Int, Int) => String, v1: Int, v2: Int): String =
		f(v1, v2);                        //> formatPair: (f: (Int, Int) => String, v1: Int, v2: Int)String

	def hyphenPairFormat(v1: Int, v2: Int): String =
		v1 + " - " + v2                   //> hyphenPairFormat: (v1: Int, v2: Int)String

	def semiColonPairFormat(v1: Int, v2: Int): String =
		v1 + " : " + v2                   //> semiColonPairFormat: (v1: Int, v2: Int)String
		
	formatPair(hyphenPairFormat, 1, 2)        //> res5: String = 1 - 2
	formatPair(semiColonPairFormat, 1, 2)     //> res6: String = 1 : 2
	
	formatPair({(x, y) => x + " - " + y}, 1, 2)
                                                  //> res7: String = 1 - 2
	formatPair({(x, y) => x + " : " + y}, 1, 2)
                                                  //> res8: String = 1 : 2
	
	
	def sum(f: Int => Int, a: Int, b: Int): Int = {
	
			def loop(a: Int, acc: Int): Int =
				if (a > b)
					acc
				else
					loop((a + 1), acc + f(a))
				
			loop(a, 0)
	}                                         //> sum: (f: Int => Int, a: Int, b: Int)Int
		
	sum({x => x}, 2, 5)                       //> res9: Int = 14
	sum({x => x * x}, 2, 5)                   //> res10: Int = 54
}