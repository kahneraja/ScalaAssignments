package funsets

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * This class is a test suite for the methods in object FunSets. To run
 * the test suite, you can either:
 *  - run the "test" command in the SBT console
 *  - right-click the file in eclipse and chose "Run As" - "JUnit Test"
 */
@RunWith(classOf[JUnitRunner])
class FunSetSuite extends FunSuite {


  /**
   * Link to the scaladoc - very clear and detailed tutorial of FunSuite
   *
   * http://doc.scalatest.org/1.9.1/index.html#org.scalatest.FunSuite
   *
   * Operators
   *  - test
   *  - ignore
   *  - pending
   */

  /**
   * Tests are written using the "test" operator and the "assert" method.
   */
  test("string take") {
    val message = "hello, world"
    assert(message.take(5) == "hello")
  }

  /**
   * For ScalaTest tests, there exists a special equality operator "===" that
   * can be used inside "assert". If the assertion fails, the two values will
   * be printed in the error message. Otherwise, when using "==", the test
   * error message will only say "assertion failed", without showing the values.
   *
   * Try it out! Change the values so that the assertion fails, and look at the
   * error message.
   */
  test("adding ints") {
    assert(1 + 2 === 3)
  }

  
  import FunSets._

  test("contains is implemented") {
    assert(contains(x => true, 100))
  }
  
  /**
   * When writing tests, one would often like to re-use certain values for multiple
   * tests. For instance, we would like to create an Int-set and have multiple test
   * about it.
   * 
   * Instead of copy-pasting the code for creating the set into every test, we can
   * store it in the test class using a val:
   * 
   *   val s1 = singletonSet(1)
   * 
   * However, what happens if the method "singletonSet" has a bug and crashes? Then
   * the test methods are not even executed, because creating an instance of the
   * test class fails!
   * 
   * Therefore, we put the shared values into a separate trait (traits are like
   * abstract classes), and create an instance inside each test method.
   * 
   */

  trait TestSets {
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)
  }

  /**
   * This test is currently disabled (by using "ignore") because the method
   * "singletonSet" is not yet implemented and the test would fail.
   * 
   * Once you finish your implementation of "singletonSet", exchange the
   * function "ignore" by "test".
   */
  test("singletonSet(1) contains 1") {
    
    /**
     * We create a new instance of the "TestSets" trait, this gives us access
     * to the values "s1" to "s3". 
     */
    new TestSets {
      /**
       * The string argument of "assert" is a message that is printed in case
       * the test fails. This helps identifying which assertion failed.
       */
      assert(contains(s1, 1), "Singleton")
      assert(!contains(s1, 2), "Singleton")
    }
  }

  test("union of {1,2,3,4,5} and {5,6,7,8,9,10}") {
    new TestSets {     
      val s = union({ x => x > 0 && x < 6 }, { x => x > 4 && x < 11 })
      assert(FunSets.toString(s) == "{1,2,3,4,5,6,7,8,9,10}", "Match:" + FunSets.toString(s))
    }
  }  
    
  test("diff of {1..1000} and {1,2,3,4}") {
    new TestSets {
      val s = diff(Set(1,3,4,5,7,1000), Set(1,2,3,4))
      assert(FunSets.toString(s) == "{5,7,1000}", "Match: " + FunSets.toString(s))
    }
  }    
  
  test("intersect of {1,2,3,4,5} and {5,6,7,8,9,10}") {
    new TestSets {
      val s = intersect(Set(1,2,3,4,5), Set(5,6,7,8,9,10))
      assert(FunSets.toString(s) == "{5}", "Match: " + FunSets.toString(s))
    }
  }   
  
  test("filter {1,2,3,4,5} by (_ < 4)") {
    new TestSets {
      val s = filter(Set(1,2,3,4,5), { _ < 4 } )
      assert(FunSets.toString(s) == "{1,2,3}", "Match: " + FunSets.toString(s))
    }
  }  
  
  test("exists {1,2,3,4,5} in which (_ < 4)") {
    new TestSets {
      val r = exists(Set(1,2,3,4,5), { _ < 4 })
      assert(r, "r: " + r)
    }
  }
  
  test("not exists {1,2,3,4,5} in which (_ > 10)") {
    new TestSets {
      val r = exists(Set(1,2,3,4,5), { _ > 10 })
      assert(!r, "r: " + r)
    }
  } 
  
  test("map {1,2,3} to {-3,-2,-1}") {
    new TestSets {
      val s = map(Set(1,2,3), x => -x)
      val r = FunSets.toString(s)
      assert(r == "{-3,-2,-1}", "Map: " + r)
    }
  }   
}
