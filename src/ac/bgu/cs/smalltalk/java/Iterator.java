package ac.bgu.cs.smalltalk.java;

import ac.bgu.cs.smalltalk.base.SmObject;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: 20/07/2006
 * Time: 21:30:48
 * To change this template use File | Settings | File Templates.
 */
public class Iterator<E extends SmObject> extends SmObject {

  protected final java.util.Iterator<E> iterator;


  /***********************************************************
   *   (private) constructors
   ***********************************************************/

  private Iterator(java.util.Iterator<E> iterator) {
    this.iterator = iterator;
  }

  /***********************************************************
   *   getInstance
   ***********************************************************/

  public static Iterator getInstance(java.util.Iterator iterator) {
    return new Iterator(iterator);
  }

}
