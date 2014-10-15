object IntSets {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val a = new NonEmpty(20, Empty, Empty) incl 5 incl 10 incl 25 incl 40 incl 1
                                                  //> a  : IntSet = {{{.1.}5{.10.}}20{.25{.40.}}}
  val b = new NonEmpty(12, Empty, Empty) incl 6 incl 14 incl 28 incl 42 incl 2
                                                  //> b  : IntSet = {{{.2.}6.}12{.14{.28{.42.}}}}
  a union b                                       //> res0: IntSet = {{{{.1.}2{.5.}}6{.10.}}12{.14{{{.20.}25.}28{{.40.}42.}}}}
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(y: IntSet): IntSet
}

// Singleton "object"
object Empty extends IntSet {
  def incl(x: Int): IntSet = {
  	new NonEmpty(x, Empty, Empty)
  }
  def contains(x: Int): Boolean = false;
  def union(y: IntSet): IntSet = {
  	y
  }
  override def toString = "."
}

class NonEmpty(e: Int, left: IntSet, right: IntSet) extends IntSet {

  def incl(x: Int): IntSet = {
    if (x < e)
      new NonEmpty(e, left incl x, right)
    else if (x > e)
      new NonEmpty(e, left, right incl x)
    else
      this
  }

  def contains(x: Int): Boolean = {
    if (x < e)
      left contains x
    else if (x > e)
      right contains x
    else
      true
  }

  def union(y: IntSet): IntSet = {
    (left.union(right)).union(y).incl(e)
  }

  override def toString = "{" + left + e + right + "}"
}