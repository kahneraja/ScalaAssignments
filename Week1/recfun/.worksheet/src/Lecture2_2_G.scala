object Lecture2_2_G {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(52); 
	def a = new Rational(440,100);System.out.println("""a: => Lecture2_2_G.Rational""");$skip(31); 
	def b = new Rational(441,100);System.out.println("""b: => Lecture2_2_G.Rational""");$skip(15); val res$0 = 
	a.description;System.out.println("""res0: String = """ + $show(res$0));$skip(21); val res$1 = 
	(a + a).description;System.out.println("""res1: String = """ + $show(res$1));$skip(7); val res$2 = 
	a < b;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(23); val res$3 = 
	(a max b).description;System.out.println("""res3: String = """ + $show(res$3))}
	
	
  class Rational(x: Int, y: Int){
  	 	
  	private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
	
  	def numer = x
  	def denom = y
  	
  	def + (x: Rational): Rational =
			new Rational(numer * x.denom + x.numer * denom, denom * x.denom)
  		
  	def description(): String = {
  		val g = gcd(numer, denom)
  		numer / g + "/" + denom / g
  	}
  	
  	def < (that: Rational): Boolean = numer * that.denom < that.numer * denom

		def max(that: Rational): Rational =
			if (this < that)
				that
			else
				this
  	
  	def neg(): Rational =
  		new Rational(-numer, denom)
  		
  	def - (x: Rational): Rational =
  		this + x.neg()
  }
}
