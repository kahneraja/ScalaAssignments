object Lecture2_2_F {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  /*
  	objects. classes. data. structures.
  	
  */
  
  /*
  	classes.
  	members.
  	methods.
   */
  

  def a = new Rational(1,3)                       //> a: => Lecture2_2_F.Rational
  def b = new Rational(5,7)                       //> b: => Lecture2_2_F.Rational
  def c = new Rational(3,2)                       //> c: => Lecture2_2_F.Rational
  a.sub(b).sub(c).description                     //> res0: String = -79:42
  
  class Rational(x: Int, y: Int){
  	def numer = x
  	def denom = y
  	
  	def add(x: Rational): Rational =
			new Rational(numer * x.denom + x.numer * denom, denom * x.denom)
  		
  	def description(): String =
  		numer + ":" + denom
  		
  	def neg(): Rational =
  		new Rational(-numer, denom)
  		
  	def sub(x: Rational): Rational =
  		add(x.neg())
  }
}


  