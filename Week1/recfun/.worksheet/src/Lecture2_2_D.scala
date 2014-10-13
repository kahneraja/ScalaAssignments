object Lecture2_2_D {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(249); 
	// review.

	/*
		EBNF: Extended Backus-Naur form.
		- | denotes alternative.
		- [...] optional (0 or 1).
		- {...} a repeatition (0 or more).
	*/
	
	/*
		Scala Types:
		- SimpleType | FunctionType
	*/
	
	def typeSimple = Int;System.out.println("""typeSimple: => Int.type""");$skip(33); 
	def typeFunction = (x:Int) => x;System.out.println("""typeFunction: => Int => Int""");$skip(465); 
	
	/*
		Expressions
		- identifier "x"
		- literal "abc"
		- function application "sqrt(x)"
		- operator application "x + x"
		- seletion "math.abs"
		- conditional "x == x"
		- block "{ ... }"
		- anonymous function "x => x + 1"
	*/
	
	/*
		Definitions
		- value definition: val ident = "1"
		- functional definition: def ident { (parameters) = expression }
	*/
	
	/*
		Parameters
		- CBV: (x: Int)
		- CBN: (x: => Int)
	*/
	
	def sum(x: Int, y: Int): Int = x + y;System.out.println("""sum: (x: Int, y: Int)Int""");$skip(47); 
	def cbnSum(x: => Int, y: => Int): Int = x + y;System.out.println("""cbnSum: (x: => Int, y: => Int)Int""");$skip(82); val res$0 = 
	// calculates the parameters first and then passes the value.
	sum(1 * 1, 2 * 2);System.out.println("""res0: Int = """ + $show(res$0));$skip(85); val res$1 = 
	
	// passes the uncomputed value down to subsequent function.
	cbnSum(1 * 1, 2 * 2);System.out.println("""res1: Int = """ + $show(res$1))}
}
