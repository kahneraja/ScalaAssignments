
object BasicFunctionsOnSets {
  
	type Set = Int => Boolean
	def contains(s: Set, elem: Int): Boolean = s(elem)
                                                  //> contains: (s: BasicFunctionsOnSets.Set, elem: Int)Boolean
 	var s = Set(1,3,4,5,7,1000)               //> s  : scala.collection.immutable.Set[Int] = Set(5, 1, 7, 1000, 3, 4)
 	var t = Set(1,2,3,4)                      //> t  : scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)

 	contains(s, 3)                            //> res0: Boolean = true
 	contains(s, 4)                            //> res1: Boolean = true
	
	
	def singletonSet(elem: Int): Set = Set(elem)
                                                  //> singletonSet: (elem: Int)BasicFunctionsOnSets.Set
	singletonSet(1)                           //> res2: BasicFunctionsOnSets.Set = Set(1)
	singletonSet(2)                           //> res3: BasicFunctionsOnSets.Set = Set(2)


	def union(s: Set, t: Set): Set =
		(x: Int) => contains(s,x) || contains(t,x)
                                                  //> union: (s: BasicFunctionsOnSets.Set, t: BasicFunctionsOnSets.Set)BasicFuncti
                                                  //| onsOnSets.Set
  def intersect(s: Set, t: Set): Set =
  	(x: Int) => contains(s,x) && contains(t,x)//> intersect: (s: BasicFunctionsOnSets.Set, t: BasicFunctionsOnSets.Set)BasicFu
                                                  //| nctionsOnSets.Set
  def diff(s: Set, t: Set): Set =
  	(x: Int) => (contains(s,x) && !contains(t,x)) || (!contains(s,x) && contains(t,x))
                                                  //> diff: (s: BasicFunctionsOnSets.Set, t: BasicFunctionsOnSets.Set)BasicFunctio
                                                  //| nsOnSets.Set
  
  def filter(s: Set, p: Int => Boolean): Set =
  	{elem: Int => contains(s,elem) && contains(p,elem)}
                                                  //> filter: (s: BasicFunctionsOnSets.Set, p: Int => Boolean)BasicFunctionsOnSets
                                                  //| .Set
  var u = union(s,t)                              //> u  : BasicFunctionsOnSets.Set = <function1>
  contains(u, 1)                                  //> res4: Boolean = true
	contains(u, 2)                            //> res5: Boolean = true
	contains(u, 3)                            //> res6: Boolean = true
	contains(u, 4)                            //> res7: Boolean = true
	contains(u, 5)                            //> res8: Boolean = true
	contains(u, 6)                            //> res9: Boolean = false
	contains(u, 7)                            //> res10: Boolean = true
	contains(u, 8)                            //> res11: Boolean = false
	
	var i = intersect(s,t)                    //> i  : BasicFunctionsOnSets.Set = <function1>
  contains(i, 1)                                  //> res12: Boolean = true
	contains(i, 2)                            //> res13: Boolean = false
	contains(i, 3)                            //> res14: Boolean = true
	contains(i, 4)                            //> res15: Boolean = true
	contains(i, 5)                            //> res16: Boolean = false
	contains(i, 6)                            //> res17: Boolean = false
	contains(i, 7)                            //> res18: Boolean = false
	contains(i, 8)                            //> res19: Boolean = false
	
	var d = diff(s,t)                         //> d  : BasicFunctionsOnSets.Set = <function1>
  contains(d, 1)                                  //> res20: Boolean = false
	contains(d, 2)                            //> res21: Boolean = true
	contains(d, 3)                            //> res22: Boolean = false
	contains(d, 4)                            //> res23: Boolean = false
	contains(d, 5)                            //> res24: Boolean = true
	contains(d, 6)                            //> res25: Boolean = false
	contains(d, 7)                            //> res26: Boolean = true
	contains(d, 8)                            //> res27: Boolean = false
	
	var f = filter(s, (x:Int) => x == 3)      //> f  : BasicFunctionsOnSets.Set = <function1>
	contains(f, 1)                            //> res28: Boolean = false
	contains(f, 2)                            //> res29: Boolean = false

	
	
}