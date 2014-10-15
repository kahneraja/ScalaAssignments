object IntSets {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val a = new NonEmpty(3, Empty, Empty)           //> a  : NonEmpty = {.3.}
  val b = new NonEmpty(4, Empty, Empty)           //> b  : NonEmpty = {.4.}
  a union b                                       //> res0: IntSet = {{.3.}4.}
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(y: IntSet): IntSet
}

// Singleton "object"
object Empty extends IntSet {
  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
  def contains(x: Int): Boolean = false;
  def union(y: IntSet): IntSet = y
  override def toString = "."
}

class NonEmpty(e: Int, left: IntSet, right: IntSet) extends IntSet {
  def incl(x: Int): IntSet =
    if (x < e)
      new NonEmpty(e, left incl x, right)
    else if (x > e)
      new NonEmpty(e, right incl x, left)
    else
      this

  def contains(x: Int): Boolean =
    if (x < e)
      left contains x
    else if (x > e)
      right contains x
    else
      true

  def union(y: IntSet): IntSet = {
    (left.union(right)).union(y) incl e
  }

  override def toString = "{" + left + e + right + "}"
}