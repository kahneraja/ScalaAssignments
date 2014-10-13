object Lecture2_2_G {
	def a = new Rational(440,100)             //> a: => Lecture2_2_G.Rational
	def b = new Rational(441,100)             //> b: => Lecture2_2_G.Rational
	a.description                             //> res0: String = 22/5
	(a + a).description                       //> res1: String = 44/5
	a < b                                     //> res2: Boolean = true
	(a max b).description                     //> res3: String = 441/100
	
	
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