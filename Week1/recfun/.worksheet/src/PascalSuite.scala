object PascalSuite {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  	def f(x: Int): Int =
  		if (x == 0) 0 else x * f(x - 1);System.out.println("""f: (x: Int)Int""");$skip(13); val res$0 = 
  		
  	f(5);System.out.println("""res0: Int = """ + $show(res$0))}
  }
