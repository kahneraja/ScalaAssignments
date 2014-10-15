object QueriesTransformationsSets {

  type Set = Int => Boolean

  val s = Set(1,3,4,5,7,1000)                     //> s  : scala.collection.immutable.Set[Int] = Set(5, 1, 7, 1000, 3, 4)
  var s1 = Set(1,2,3,4)                           //> s1  : scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)
	
	def contains(s: Set, elem: Int): Boolean = s(elem)
                                                  //> contains: (s: QueriesTransformationsSets.Set, elem: Int)Boolean
	
	def union(s: Set, t: Set): Set =
		(x: Int) => contains(s,x) || contains(t,x)
                                                  //> union: (s: QueriesTransformationsSets.Set, t: QueriesTransformationsSets.Set
                                                  //| )QueriesTransformationsSets.Set
  
  def filter(s: Set, p: Int => Boolean): Set =
  	(x: Int) => p(x)                          //> filter: (s: QueriesTransformationsSets.Set, p: Int => Boolean)QueriesTransfo
                                                  //| rmationsSets.Set

  val bound = 1000                                //> bound  : Int = 1000

  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
	   if (a <= -bound)
	   	true
	   else if (contains(s, a) && !p(a))
	   	false
	   else
	   	iter(a-1)
    }
    iter(bound)
  }                                               //> forall: (s: QueriesTransformationsSets.Set, p: Int => Boolean)Boolean
 	
 	forall(s, (x: Int) => x < 11)             //> res0: Boolean = false
 	forall(s, (x: Int) => x < 10)             //> res1: Boolean = false
 	
 	
  def exists(s: Set, p: Int => Boolean): Boolean =
		forall(filter(s, p), p)           //> exists: (s: QueriesTransformationsSets.Set, p: Int => Boolean)Boolean
  
  exists(s, (x: Int) => x == 10)                  //> res2: Boolean = true
  exists(s, (x: Int) => x == 11)                  //> res3: Boolean = true
  
  def map(s: Set, f: Int => Int): Set =
  	(x:Int) => exists(s, (y:Int) => f(y) == x)//> map: (s: QueriesTransformationsSets.Set, f: Int => Int)QueriesTransformation
                                                  //| sSets.Set
  
	
	val r = map(s, (x:Int) => x + 1)          //> r  : QueriesTransformationsSets.Set = <function1>
  
  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  }                                               //> toString: (s: QueriesTransformationsSets.Set)String
}