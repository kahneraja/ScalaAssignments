
object BasicFunctionsOnSets {
  
	type Set = Int => Boolean
	def contains(s: Set, elem: Int): Boolean = s(elem)
 	var s = Set(1,2,3,4)
 	var t = Set(4,5,6,7)

 	contains(s, 3)
 	contains(s, 4)
	
	
	def singletonSet(elem: Int): Set = Set(elem)
	singletonSet(1)
	singletonSet(2)


	def union(s: Set, t: Set): Set =
		(x: Int) => contains(s,x) || contains(t,x)
  def intersect(s: Set, t: Set): Set =
  	(x: Int) => contains(s,x) && contains(t,x)
  def diff(s: Set, t: Set): Set =
  	(x: Int) => (contains(s,x) && !contains(t,x)) || (!contains(s,x) && contains(t,x))
  
  def filter(s: Set, p: Int => Boolean): Set =
  	(x: Int) => p(x)
  var u = union(s,t)
  contains(u, 1)
	contains(u, 2)
	contains(u, 3)
	contains(u, 4)
	contains(u, 5)
	contains(u, 6)
	contains(u, 7)
	contains(u, 8)
	
	var i = intersect(s,t)
  contains(i, 1)
	contains(i, 2)
	contains(i, 3)
	contains(i, 4)
	contains(i, 5)
	contains(i, 6)
	contains(i, 7)
	contains(i, 8)
	
	var d = diff(s,t)
  contains(d, 1)
	contains(d, 2)
	contains(d, 3)
	contains(d, 4)
	contains(d, 5)
	contains(d, 6)
	contains(d, 7)
	contains(d, 8)
	
	var f = filter(s, (x:Int) => x == 3)
	contains(f, 1)
	contains(f, 2)
	
	// def intersect(s: Set, t: Set): Set
	// def diff(s: Set, t: Set): Set
	
	var hundred = Set{1...100}
	
	
}