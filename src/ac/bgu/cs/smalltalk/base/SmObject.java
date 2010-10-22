package ac.bgu.cs.smalltalk.base;


import ac.bgu.cs.smalltalk.java.StString;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: 19/07/2006
 * Time: 20:07:41
 *
 * Smalltalk Object
 * This is the base object in the smalltalk system and should be
 * th ONLY place that extends a Java class. (Although you may delegate a class)
 *
 */
public class SmObject extends java.lang.Object {

  protected SmObject() {
  }

  protected SmObject message(SmObject message) {
    return null;
  }
  
  protected final SmObject self() {
    return this;
  }

  protected SmObject clone() {
    return this;  // todo
  }

  public StString asString() {
    return null;
  }


  //  ------------- UnsupportedOperationException ----------------------

  public int hashCode() {
    throw new UnsupportedOperationException("int hashCode() is not allowed.");
  }

  public boolean equals(Object obj) {
    throw new UnsupportedOperationException("boolean equals(Object obj) is not allowed.");
  }


  public java.lang.String toString() {
    throw new UnsupportedOperationException(" StString toString()  is not allowed.");
  }

  /**
   * I cannot throw Exception here, since this may be used by the Garbage-Collector
   * Technically, there should not be any harm in a system method that is not part of the smalltalk.
   * @throws Throwable
   */
//  protected void finalize() throws Throwable {
//    super.finalize();    //To change body of overridden methods use File | Settings | File Templates.
//  }


}
