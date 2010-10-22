package ac.bgu.cs.smalltalk.java;

import ac.bgu.cs.smalltalk.base.SmObject;
import ac.bgu.cs.smalltalk.base.VoidObject;
import ac.bgu.cs.smalltalk.number.StNumber;
import ac.bgu.cs.smalltalk.bool.Boolean;


/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: 20/07/2006
 * Time: 23:59:48
 * To change this template use File | Settings | File Templates.
 */
public class Collection<E extends SmObject> extends SmObject {

  protected final java.util.Collection collection;
  protected final E nil;

  protected Collection(java.util.Collection collection, E nil) {
    this.collection = collection;
    this.nil = nil;
  }

  public static Collection getInstance(java.util.Collection collection, SmObject nil) {
    return new Collection(collection, nil);
  }

  /**
   * Returns the number of elements in this collection.  If this collection
   * contains more than <tt>StInteger.MAX_VALUE</tt> elements, returns
   * <tt>StInteger.MAX_VALUE</tt>.
   *
   * @return the number of elements in this collection
   */
  public StNumber size() {
    return StNumber.getInstance(collection.size());
  }

  /**
   * Returns <tt>true</tt> if this collection contains no elements.
   *
   * @return <tt>true</tt> if this collection contains no elements
   */
  public Boolean isEmpty() {
    return Boolean.getInstance(collection.isEmpty());
  }

  /**
   * Returns <tt>true</tt> if this collection contains the specified
   * element.  More formally, returns <tt>true</tt> if and only if this
   * collection contains at least one element <tt>e</tt> such that
   * <tt>(o==null ? e==null : o.equals(e))</tt>.
   *
   * @param o element whose presence in this collection is to be tested.
   * @return <tt>true</tt> if this collection contains the specified
   *         element
   * @throws ClassCastException   if the type of the specified element
   *                              is incompatible with this collection (optional).
   * @throws NullPointerException if the specified element is null and this
   *                              collection does not support null elements (optional).
   */
  public Boolean contains(SmObject o) {
    return Boolean.getInstance(collection.contains(o));
  }

  /**
   * Returns an iterator over the elements in this collection.  There are no
   * guarantees concerning the order in which the elements are returned
   * (unless this collection is an instance of some class that provides a
   * guarantee).
   *
   * @return an <tt>Iterator</tt> over the elements in this collection
   */
  public Iterator iterator() {
    return Iterator.getInstance(collection.iterator());
  }

  /**
   * CANCELED
   * Returns an array containing all of the elements in this collection;
   * the runtime type of the returned array is that of the specified array.
   * If the collection fits in the specified array, it is returned therein.
   * Otherwise, a new array is allocated with the runtime type of the
   * specified array and the size of this collection.<p>
   * <p/>
   */

  /**
   * Ensures that this collection contains the specified element (optional
   * operation).  Returns <tt>true</tt> if this collection changed as a
   * result of the call.  (Returns <tt>false</tt> if this collection does
   * not permit duplicates and already contains the specified element.)<p>
   * <p/>
   * Collections that support this operation may place limitations on what
   * elements may be added to this collection.  In particular, some
   * collections will refuse to add <tt>null</tt> elements, and others will
   * impose restrictions on the type of elements that may be added.
   * Collection classes should clearly specify in their documentation any
   * restrictions on what elements may be added.<p>
   * <p/>
   * If a collection refuses to add a particular element for any reason
   * other than that it already contains the element, it <i>must</i> throw
   * an exception (rather than returning <tt>false</tt>).  This preserves
   * the invariant that a collection always contains the specified element
   * after this call returns.
   *
   * @param o element whose presence in this collection is to be ensured.
   * @return <tt>true</tt> if this collection changed as a result of the
   *         call
   * @throws UnsupportedOperationException <tt>add</tt> is not supported by
   *                                       this collection.
   * @throws ClassCastException            class of the specified element prevents it
   *                                       from being added to this collection.
   * @throws NullPointerException          if the specified element is null and this
   *                                       collection does not support null elements.
   * @throws IllegalArgumentException      some aspect of this element prevents
   *                                       it from being added to this collection.
   */
  public Boolean add(E o) {
    return Boolean.getInstance(collection.add(o));
  }

  /**
   * Removes a single instance of the specified element from this
   * collection, if it is present (optional operation).  More formally,
   * removes an element <tt>e</tt> such that <tt>(o==null ?  e==null :
   * o.equals(e))</tt>, if this collection contains one or more such
   * elements.  Returns true if this collection contained the specified
   * element (or equivalently, if this collection changed as a result of the
   * call).
   *
   * @param o element to be removed from this collection, if present.
   * @return <tt>true</tt> if this collection changed as a result of the
   *         call
   * @throws ClassCastException            if the type of the specified element
   *                                       is incompatible with this collection (optional).
   * @throws NullPointerException          if the specified element is null and this
   *                                       collection does not support null elements (optional).
   * @throws UnsupportedOperationException remove is not supported by this
   *                                       collection.
   */
  public Boolean remove(SmObject o) {
    return Boolean.getInstance(collection.remove(o));
  }

  /**
   * Returns <tt>true</tt> if this collection contains all of the elements
   * in the specified collection.
   *
   * @param c collection to be checked for containment in this collection.
   * @return <tt>true</tt> if this collection contains all of the elements
   *         in the specified collection
   * @throws ClassCastException   if the types of one or more elements
   *                              in the specified collection are incompatible with this
   *                              collection (optional).
   * @throws NullPointerException if the specified collection contains one
   *                              or more null elements and this collection does not support null
   *                              elements (optional).
   * @throws NullPointerException if the specified collection is
   *                              <tt>null</tt>.
   * @see #contains(SmObject)
   */
  public Boolean containsAll(Collection c) {
    return Boolean.getInstance(collection.containsAll(c.collection));
  }

  /**
   * Adds all of the elements in the specified collection to this collection
   * (optional operation).  The behavior of this operation is undefined if
   * the specified collection is modified while the operation is in progress.
   * (This implies that the behavior of this call is undefined if the
   * specified collection is this collection, and this collection is
   * nonempty.)
   *
   * @param c elements to be inserted into this collection.
   * @return <tt>true</tt> if this collection changed as a result of the
   *         call
   * @throws UnsupportedOperationException if this collection does not
   *                                       support the <tt>addAll</tt> method.
   * @throws ClassCastException            if the class of an element of the specified
   *                                       collection prevents it from being added to this collection.
   * @throws NullPointerException          if the specified collection contains one
   *                                       or more null elements and this collection does not support null
   *                                       elements, or if the specified collection is <tt>null</tt>.
   * @throws IllegalArgumentException      some aspect of an element of the
   *                                       specified collection prevents it from being added to this
   *                                       collection.
   * @see #add(SmObject)
   */
  public Boolean addAll(Collection c) {
    return Boolean.getInstance(collection.addAll(c.collection));
  }

  /**
   * Removes all this collection's elements that are also contained in the
   * specified collection (optional operation).  After this call returns,
   * this collection will contain no elements in common with the specified
   * collection.
   *
   * @param c elements to be removed from this collection.
   * @return <tt>true</tt> if this collection changed as a result of the
   *         call
   * @throws UnsupportedOperationException if the <tt>removeAll</tt> method
   *                                       is not supported by this collection.
   * @throws ClassCastException            if the types of one or more elements
   *                                       in this collection are incompatible with the specified
   *                                       collection (optional).
   * @throws NullPointerException          if this collection contains one or more
   *                                       null elements and the specified collection does not support
   *                                       null elements (optional).
   * @throws NullPointerException          if the specified collection is
   *                                       <tt>null</tt>.
   * @see #remove(SmObject)
   * @see #contains(SmObject)
   */
  public Boolean removeAll(Collection c) {
    return Boolean.getInstance(collection.removeAll(c.collection));
  }

  /**
   * Retains only the elements in this collection that are contained in the
   * specified collection (optional operation).  In other words, removes from
   * this collection all of its elements that are not contained in the
   * specified collection.
   *
   * @param c elements to be retained in this collection.
   * @return <tt>true</tt> if this collection changed as a result of the
   *         call
   * @throws UnsupportedOperationException if the <tt>retainAll</tt> method
   *                                       is not supported by this Collection.
   * @throws ClassCastException            if the types of one or more elements
   *                                       in this collection are incompatible with the specified
   *                                       collection (optional).
   * @throws NullPointerException          if this collection contains one or more
   *                                       null elements and the specified collection does not support null
   *                                       elements (optional).
   * @throws NullPointerException          if the specified collection is
   *                                       <tt>null</tt>.
   * @see #remove(SmObject)
   * @see #contains(SmObject)
   */
  public Boolean retainAll(Collection c) {
    return Boolean.getInstance(collection.retainAll(c.collection));
  }

  /**
   * Removes all of the elements from this collection (optional operation).
   * This collection will be empty after this method returns unless it
   * throws an exception.
   *
   * @throws UnsupportedOperationException if the <tt>clear</tt> method is
   *                                       not supported by this collection.
   */
  public VoidObject clear() {
    collection.clear();
    return VoidObject.getInstance();
  }

}
