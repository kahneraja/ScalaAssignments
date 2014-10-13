object Lecture2_2_D {
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
	
	def typeSimple = Int                      //> typeSimple: => Int.type
	def typeFunction = (x:Int) => x           //> typeFunction: => Int => Int
	
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
	
	def sum(x: Int, y: Int): Int = x + y      //> sum: (x: Int, y: Int)Int
	def cbnSum(x: => Int, y: => Int): Int = x + y
                                                  //> cbnSum: (x: => Int, y: => Int)Int
	// calculates the parameters first and then passes the value.
	sum(1 * 1, 2 * 2)                         //> res0: Int = 5
	
	// passes the uncomputed value down to subsequent function.
	cbnSum(1 * 1, 2 * 2)                      //> res1: Int = 5
}