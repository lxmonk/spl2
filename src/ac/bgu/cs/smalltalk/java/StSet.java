package ac.bgu.cs.smalltalk.java;

import ac.bgu.cs.smalltalk.base.SmObject;
import ac.bgu.cs.smalltalk.base.VoidObject;
import ac.bgu.cs.smalltalk.number.StNumber;
import ac.bgu.cs.smalltalk.bool.Boolean;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: 20/07/2006
 * Time: 19:27:54
 * To change this template use File | Settings | File Templates.
 */
public class StSet<E extends SmObject> extends Collection<E> {

  protected final java.util.Set<E> set;

  /***********************************************************
   *   (private) constructors
   ***********************************************************/

  protected StSet(java.util.Set<E> set, E nil) {
    super(set, nil);
    this.set = set;
  }

//  private StMap(StMap<? extends K, ? extends V> map) {
//    map = new java.util.StMap(map);
//  }

  /***********************************************************
   *   getInstance
   ***********************************************************/

  public  static StSet getInstance(java.util.Set set, SmObject nil) {
    return new StSet(set, nil);
  }

  /**
   * Returns the number of elements in this set (its cardinality).  If this
   * set contains more than <tt>StInteger.MAX_VALUE</tt> elements, returns
   * <tt>StInteger.MAX_VALUE</tt>.
   *
   * @return the number of elements in this set (its cardinality).
   */
  public StNumber size() {
    return StNumber.getInstance(set.size());
  }

  /**
   * Returns <tt>true</tt> if this set contains no elements.
   *
   * @return <tt>true</tt> if this set contains no elements.
   */
  public Boolean isEmpty() {
    return Boolean.getInstance(set.isEmpty());
  }

  /**
   * Returns <tt>true</tt> if this set contains the specified element.  More
   * formally, returns <tt>true</tt> if and only if this set contains an
   * element <code>e</code> such that <code>(o==null ? e==null :
   * o.equals(e))</code>.
   *
   * @param o element whose presence in this set is to be tested.
   * @return <tt>true</tt> if this set contains the specified element.
   * @throws ClassCastException   if the type of the specified element
   *                              is incompatible with this set (optional).
   * @throws NullPointerException if the specified element is null and this
   *                              set does not support null elements (optional).
   */
  public Boolean contains(SmObject o) {
    return Boolean.getInstance(set.contains(o));
  }

  /**
   * Returns an iterator over the elements in this set.  The elements are
   * returned in no particular order (unless this set is an instance of some
   * class that provides a guarantee).
   *
   * @return an iterator over the elements in this set.
   */
  public Iterator<E> iterator() {
    return Iterator.getInstance(set.iterator());
  }

  /**
   * Returns an array containing all of the elements in this set.
   * Obeys the general contract of the <tt>Collection.toArray</tt> method.
   *
   * @return an array containing all of the elements in this set.
   */
//  public Object[] toArray() {
//    return new Object[0];  //To change body of implemented methods use File | Settings | File Templates.
//  }

  /**
   * Returns an array containing all of the elements in this set; the
   * runtime type of the returned array is that of the specified array.
   * Obeys the general contract of the
   * <tt>Collection.toArray(Object[])</tt> method.
   *
   * @param ts the array into which the elements of this set are to
   *          be stored, if it is big enough; otherwise, a new array of the
   *          same runtime type is allocated for this purpose.
   * @return an array containing the elements of this set.
   * @throws ArrayStoreException  the runtime type of a is not a supertype
   *                              of the runtime type of every element in this set.
   * @throws NullPointerException if the specified array is <tt>null</tt>.
   */
//  public <T> T[] toArray(T[] ts) {
//    return new T[0];  //To change body of implemented methods use File | Settings | File Templates.
//  }

  /**
   * Adds the specified element to this set if it is not already present
   * (optional operation).  More formally, adds the specified element,
   * <code>o</code>, to this set if this set contains no element
   * <code>e</code> such that <code>(o==null ? e==null :
   * o.equals(e))</code>.  If this set already contains the specified
   * element, the call leaves this set unchanged and returns <tt>false</tt>.
   * In combination with the restriction on constructors, this ensures that
   * sets never contain duplicate elements.<p>
   * <p/>
   * The stipulation above does not imply that sets must accept all
   * elements; sets may refuse to add any particular element, including
   * <tt>null</tt>, and throwing an exception, as described in the
   * specification for <tt>Collection.add</tt>.  Individual set
   * implementations should clearly document any restrictions on the
   * elements that they may contain.
   *
   * @param e element to be added to this set.
   * @return <tt>true</tt> if this set did not already contain the specified
   *         element.
   * @throws UnsupportedOperationException if the <tt>add</tt> method is not
   *                                       supported by this set.
   * @throws ClassCastException            if the class of the specified element
   *                                       prevents it from being added to this set.
   * @throws NullPointerException          if the specified element is null and this
   *                                       set does not support null elements.
   * @throws IllegalArgumentException      if some aspect of the specified element
   *                                       prevents it from being added to this set.
   */
  public Boolean add(E e) {
    return Boolean.getInstance(set.add(e));
  }

  /**
   * Removes the specified element from this set if it is present (optional
   * operation).  More formally, removes an element <code>e</code> such that
   * <code>(o==null ?  e==null : o.equals(e))</code>, if the set contains
   * such an element.  Returns <tt>true</tt> if the set contained the
   * specified element (or equivalently, if the set changed as a result of
   * the call).  (The set will not contain the specified element once the
   * call returns.)
   *
   * @param o object to be removed from this set, if present.
   * @return true if the set contained the specified element.
   * @throws ClassCastException            if the type of the specified element
   *                                       is incompatible with this set (optional).
   * @throws NullPointerException          if the specified element is null and this
   *                                       set does not support null elements (optional).
   * @throws UnsupportedOperationException if the <tt>remove</tt> method is
   *                                       not supported by this set.
   */
  public Boolean remove(SmObject o) {
    return Boolean.getInstance(set.remove(o));
  }

  /**
   * Returns <tt>true</tt> if this set contains all of the elements of the
   * specified collection.  If the specified collection is also a set, this
   * method returns <tt>true</tt> if it is a <i>subset</i> of this set.
   *
   * @param c collection to be checked for containment in this set.
   * @return <tt>true</tt> if this set contains all of the elements of the
   *         specified collection.
   * @throws ClassCastException   if the types of one or more elements
   *                              in the specified collection are incompatible with this
   *                              set (optional).
   * @throws NullPointerException if the specified collection contains one
   *                              or more null elements and this set does not support null
   *                              elements (optional).
   * @throws NullPointerException if the specified collection is
   *                              <tt>null</tt>.
   * @see #contains(SmObject)
   */
  public Boolean containsAll(Collection c) {
    return Boolean.getInstance(set.containsAll(c.collection));
  }

  /**
   * Adds all of the elements in the specified collection to this set if
   * they're not already present (optional operation).  If the specified
   * collection is also a set, the <tt>addAll</tt> operation effectively
   * modifies this set so that its value is the <i>union</i> of the two
   * sets.  The behavior of this operation is unspecified if the specified
   * collection is modified while the operation is in progress.
   *
   * @param es collection whose elements are to be added to this set.
   * @return <tt>true</tt> if this set changed as a result of the call.
   * @throws UnsupportedOperationException if the <tt>addAll</tt> method is
   *                                       not supported by this set.
   * @throws ClassCastException            if the class of some element of the
   *                                       specified collection prevents it from being added to this
   *                                       set.
   * @throws NullPointerException          if the specified collection contains one
   *                                       or more null elements and this set does not support null
   *                                       elements, or if the specified collection is <tt>null</tt>.
   * @throws IllegalArgumentException      if some aspect of some element of the
   *                                       specified collection prevents it from being added to this
   *                                       set.
   * @see #add(SmObject)
   */
  public Boolean addAll(Collection es) {
    return Boolean.getInstance(set.addAll(es.collection));
  }

  /**
   * Retains only the elements in this set that are contained in the
   * specified collection (optional operation).  In other words, removes
   * from this set all of its elements that are not contained in the
   * specified collection.  If the specified collection is also a set, this
   * operation effectively modifies this set so that its value is the
   * <i>intersection</i> of the two sets.
   *
   * @param c collection that defines which elements this set will retain.
   * @return <tt>true</tt> if this collection changed as a result of the
   *         call.
   * @throws UnsupportedOperationException if the <tt>retainAll</tt> method
   *                                       is not supported by this Collection.
   * @throws ClassCastException            if the types of one or more elements in this
   *                                       set are incompatible with the specified collection
   *                                       (optional).
   * @throws NullPointerException          if this set contains a null element and
   *                                       the specified collection does not support null elements
   *                                       (optional).
   * @throws NullPointerException          if the specified collection is
   *                                       <tt>null</tt>.
   * @see #remove(SmObject)
   */
  public Boolean retainAll(Collection c) {
    return Boolean.getInstance(set.retainAll(c.collection));
  }

  /**
   * Removes from this set all of its elements that are contained in the
   * specified collection (optional operation).  If the specified
   * collection is also a set, this operation effectively modifies this
   * set so that its value is the <i>asymmetric set difference</i> of
   * the two sets.
   *
   * @param c collection that defines which elements will be removed from
   *          this set.
   * @return <tt>true</tt> if this set changed as a result of the call.
   * @throws UnsupportedOperationException if the <tt>removeAll</tt>
   *                                       method is not supported by this Collection.
   * @throws ClassCastException            if the types of one or more elements in this
   *                                       set are incompatible with the specified collection
   *                                       (optional).
   * @throws NullPointerException          if this set contains a null element and
   *                                       the specified collection does not support null elements
   *                                       (optional).
   * @throws NullPointerException          if the specified collection is
   *                                       <tt>null</tt>.
   * @see #remove(SmObject)
   */
  public Boolean removeAll(Collection c) {
    return Boolean.getInstance(set.removeAll(c.collection));
  }

  /**
   * Removes all of the elements from this set (optional operation).
   * This set will be empty after this call returns (unless it throws an
   * exception).
   *
   * @throws UnsupportedOperationException if the <tt>clear</tt> method
   *                                       is not supported by this set.
   */
  public VoidObject clear() {
    set.clear();
    return VoidObject.getInstance();
  }


}
