object PascalSuite {
  
	  
  def pascal(c: Int, r: Int): Int = {
      def isEdge : Boolean = (c == 0 || c == r)
	  def parentSum(c: Int, r: Int): Int = pascal(c-1, r-1) + pascal(c, r-1)
  	if (isEdge) 1 else parentSum(c, r)
  }                                               //> pascal: (c: Int, r: Int)Int
		
  pascal(1,1)                                     //> res0: Int = 1
  pascal(1,2)                                     //> res1: Int = 2
  pascal(2, 4)                                    //> res2: Int = 6
  pascal(0,0)                                     //> res3: Int = 1
  }