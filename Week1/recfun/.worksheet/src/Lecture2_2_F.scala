object Lecture2_2_F {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(138); 
  
  /*
  	objects. classes. data. structures.
  	
  */
  
  /*
  	classes.
  	members.
  	methods.
   */
  

  def a = new Rational(1,3);System.out.println("""a: => Lecture2_2_F.Rational""");$skip(28); 
  def b = new Rational(5,7);System.out.println("""b: => Lecture2_2_F.Rational""");$skip(28); 
  def c = new Rational(3,2);System.out.println("""c: => Lecture2_2_F.Rational""");$skip(30); val res$0 = 
  a.sub(b).sub(c).description;System.out.println("""res0: String = """ + $show(res$0))}
  
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


  