package funsets

object Research {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(175); 
  def sumRange(x: Int, y: Int): Int =
  	if (x == y)
  		x;
  	else if (x < y)
  		x + sumRange(x + 1, y)
  	else
  		y + sumRange(y + 1, x);System.out.println("""sumRange: (x: Int, y: Int)Int""");$skip(26); val res$0 = 
  		
  		
  sumRange(1,2);System.out.println("""res0: Int = """ + $show(res$0));$skip(16); val res$1 = 
  sumRange(1,1);System.out.println("""res1: Int = """ + $show(res$1));$skip(18); val res$2 = 
 
  sumRange(1,5);System.out.println("""res2: Int = """ + $show(res$2));$skip(18); val res$3 = 
  sumRange(-1, 1);System.out.println("""res3: Int = """ + $show(res$3));$skip(18); val res$4 = 
  sumRange(-2, 0);System.out.println("""res4: Int = """ + $show(res$4));$skip(89); 
  
  
  def formatPair(f: (Int, Int) => String, v1: Int, v2: Int): String =
		f(v1, v2);System.out.println("""formatPair: (f: (Int, Int) => String, v1: Int, v2: Int)String""");$skip(69); ;

	def hyphenPairFormat(v1: Int, v2: Int): String =
		v1 + " - " + v2;System.out.println("""hyphenPairFormat: (v1: Int, v2: Int)String""");$skip(72); 

	def semiColonPairFormat(v1: Int, v2: Int): String =
		v1 + " : " + v2;System.out.println("""semiColonPairFormat: (v1: Int, v2: Int)String""");$skip(39); val res$5 = 
		
	formatPair(hyphenPairFormat, 1, 2);System.out.println("""res5: String = """ + $show(res$5));$skip(39); val res$6 = 
	formatPair(semiColonPairFormat, 1, 2);System.out.println("""res6: String = """ + $show(res$6));$skip(47); val res$7 = 
	
	formatPair({(x, y) => x + " - " + y}, 1, 2);System.out.println("""res7: String = """ + $show(res$7));$skip(45); val res$8 = 
	formatPair({(x, y) => x + " : " + y}, 1, 2);System.out.println("""res8: String = """ + $show(res$8));$skip(178); 
	
	
	def sum(f: Int => Int, a: Int, b: Int): Int = {
	
			def loop(a: Int, acc: Int): Int =
				if (a > b)
					acc
				else
					loop((a + 1), acc + f(a))
				
			loop(a, 0)
	};System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(24); val res$9 = 
		
	sum({x => x}, 2, 5);System.out.println("""res9: Int = """ + $show(res$9));$skip(25); val res$10 = 
	sum({x => x * x}, 2, 5);System.out.println("""res10: Int = """ + $show(res$10))}
}
