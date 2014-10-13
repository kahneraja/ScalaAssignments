
object BasicFunctionsOnSets {
  
	type Set = Int => Boolean;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(112); 
	def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: BasicFunctionsOnSets.Set, elem: Int)Boolean""");$skip(23); 
 	var s = Set(1,2,3,4);System.out.println("""s  : scala.collection.immutable.Set[Int] = """ + $show(s ));$skip(23); 
 	var t = Set(4,5,6,7);System.out.println("""t  : scala.collection.immutable.Set[Int] = """ + $show(t ));$skip(18); val res$0 = 

 	contains(s, 3);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(17); val res$1 = 
 	contains(s, 4);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(50); 
	
	
	def singletonSet(elem: Int): Set = Set(elem);System.out.println("""singletonSet: (elem: Int)BasicFunctionsOnSets.Set""");$skip(17); val res$2 = 
	singletonSet(1);System.out.println("""res2: BasicFunctionsOnSets.Set = """ + $show(res$2));$skip(17); val res$3 = 
	singletonSet(2);System.out.println("""res3: BasicFunctionsOnSets.Set = """ + $show(res$3));$skip(82); 


	def union(s: Set, t: Set): Set =
		(x: Int) => contains(s,x) || contains(t,x);System.out.println("""union: (s: BasicFunctionsOnSets.Set, t: BasicFunctionsOnSets.Set)BasicFunctionsOnSets.Set""");$skip(85); 
  def intersect(s: Set, t: Set): Set =
  	(x: Int) => contains(s,x) && contains(t,x);System.out.println("""intersect: (s: BasicFunctionsOnSets.Set, t: BasicFunctionsOnSets.Set)BasicFunctionsOnSets.Set""");$skip(120); 
  def diff(s: Set, t: Set): Set =
  	(x: Int) => (contains(s,x) && !contains(t,x)) || (!contains(s,x) && contains(t,x));System.out.println("""diff: (s: BasicFunctionsOnSets.Set, t: BasicFunctionsOnSets.Set)BasicFunctionsOnSets.Set""");$skip(70); 
  
  def filter(s: Set, p: Int => Boolean): Set =
  	(x: Int) => p(x);System.out.println("""filter: (s: BasicFunctionsOnSets.Set, p: Int => Boolean)BasicFunctionsOnSets.Set""");$skip(21); 
  var u = union(s,t);System.out.println("""u  : BasicFunctionsOnSets.Set = """ + $show(u ));$skip(17); val res$4 = 
  contains(u, 1);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(16); val res$5 = 
	contains(u, 2);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(16); val res$6 = 
	contains(u, 3);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(16); val res$7 = 
	contains(u, 4);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(16); val res$8 = 
	contains(u, 5);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(16); val res$9 = 
	contains(u, 6);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(16); val res$10 = 
	contains(u, 7);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(16); val res$11 = 
	contains(u, 8);System.out.println("""res11: Boolean = """ + $show(res$11));$skip(26); 
	
	var i = intersect(s,t);System.out.println("""i  : BasicFunctionsOnSets.Set = """ + $show(i ));$skip(17); val res$12 = 
  contains(i, 1);System.out.println("""res12: Boolean = """ + $show(res$12));$skip(16); val res$13 = 
	contains(i, 2);System.out.println("""res13: Boolean = """ + $show(res$13));$skip(16); val res$14 = 
	contains(i, 3);System.out.println("""res14: Boolean = """ + $show(res$14));$skip(16); val res$15 = 
	contains(i, 4);System.out.println("""res15: Boolean = """ + $show(res$15));$skip(16); val res$16 = 
	contains(i, 5);System.out.println("""res16: Boolean = """ + $show(res$16));$skip(16); val res$17 = 
	contains(i, 6);System.out.println("""res17: Boolean = """ + $show(res$17));$skip(16); val res$18 = 
	contains(i, 7);System.out.println("""res18: Boolean = """ + $show(res$18));$skip(16); val res$19 = 
	contains(i, 8);System.out.println("""res19: Boolean = """ + $show(res$19));$skip(21); 
	
	var d = diff(s,t);System.out.println("""d  : BasicFunctionsOnSets.Set = """ + $show(d ));$skip(17); val res$20 = 
  contains(d, 1);System.out.println("""res20: Boolean = """ + $show(res$20));$skip(16); val res$21 = 
	contains(d, 2);System.out.println("""res21: Boolean = """ + $show(res$21));$skip(16); val res$22 = 
	contains(d, 3);System.out.println("""res22: Boolean = """ + $show(res$22));$skip(16); val res$23 = 
	contains(d, 4);System.out.println("""res23: Boolean = """ + $show(res$23));$skip(16); val res$24 = 
	contains(d, 5);System.out.println("""res24: Boolean = """ + $show(res$24));$skip(16); val res$25 = 
	contains(d, 6);System.out.println("""res25: Boolean = """ + $show(res$25));$skip(16); val res$26 = 
	contains(d, 7);System.out.println("""res26: Boolean = """ + $show(res$26));$skip(16); val res$27 = 
	contains(d, 8);System.out.println("""res27: Boolean = """ + $show(res$27));$skip(40); 
	
	var f = filter(s, (x:Int) => x == 3);System.out.println("""f  : BasicFunctionsOnSets.Set = """ + $show(f ));$skip(16); val res$28 = 
	contains(f, 1);System.out.println("""res28: Boolean = """ + $show(res$28));$skip(16); val res$29 = 
	contains(f, 2);System.out.println("""res29: Boolean = """ + $show(res$29));$skip(106); 
	
	// def intersect(s: Set, t: Set): Set
	// def diff(s: Set, t: Set): Set
	
	var hundred = Set{1...100};System.out.println("""hundred  : <error> = """ + $show(hundred ))}
	
	
}
