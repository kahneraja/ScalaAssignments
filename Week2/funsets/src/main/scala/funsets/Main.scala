package funsets

object Main extends App {

  type Set = Int => Boolean
  def contains(s: Set, elem: Int): Boolean = s(elem)

  def union(s: Set, t: Set): Set =
    (x: Int) => contains(s, x) || contains(t, x)
  //> union: (s: BasicFunctionsOnSets.Set, t: BasicFunctionsOnSets.Set)BasicFuncti
  //| onsOnSets.Set
  def intersect(s: Set, t: Set): Set =
    (x: Int) => contains(s, x) && contains(t, x) //> intersect: (s: BasicFunctionsOnSets.Set, t: BasicFunctionsOnSets.Set)BasicFu
  //| nctionsOnSets.Set
  def diff(s: Set, t: Set): Set =
    (x: Int) => (contains(s, x) && !contains(t, x)) || (!contains(s, x) && contains(t, x))
  //> diff: (s: BasicFunctionsOnSets.Set, t: BasicFunctionsOnSets.Set)BasicFunctio
  //| nsOnSets.Set

  def filter(s: Set, p: Int => Boolean): Set =
    (x: Int) => p(x)
}
