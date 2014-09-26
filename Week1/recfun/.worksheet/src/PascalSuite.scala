object PascalSuite {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(229); 
  
	  
  def pascal(c: Int, r: Int): Int = {
      def isEdge : Boolean = (c == 0 || c == r)
	  def parentSum(c: Int, r: Int): Int = pascal(c-1, r-1) + pascal(c, r-1)
  	if (isEdge) 1 else parentSum(c, r)
  };System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(17); val res$0 = 
		
  pascal(1,1);System.out.println("""res0: Int = """ + $show(res$0));$skip(14); val res$1 = 
  pascal(1,2);System.out.println("""res1: Int = """ + $show(res$1));$skip(15); val res$2 = 
  pascal(2, 4);System.out.println("""res2: Int = """ + $show(res$2));$skip(14); val res$3 = 
  pascal(0,0);System.out.println("""res3: Int = """ + $show(res$3))}
  }
