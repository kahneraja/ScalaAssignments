object Research {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(102); 
	  	// pascal(c-1, r-1) + pascal(c, r-1)
		  
	  def pascal(c: Int, r: Int): Int = 1;System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(70); val res$0 = 
			// if (c == 0 || c == r) 1 else parentSum(c, r)
			
	  pascal(1,1);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
	  pascal(1,2);System.out.println("""res1: Int = """ + $show(res$1))}
  }
