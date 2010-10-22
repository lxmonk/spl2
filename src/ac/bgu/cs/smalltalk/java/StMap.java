package ac.bgu.cs.smalltalk.java;

import ac.bgu.cs.smalltalk.base.SmObject;
import ac.bgu.cs.smalltalk.base.VoidObject;
import ac.bgu.cs.smalltalk.number.StNumber;
import ac.bgu.cs.smalltalk.bool.Boolean;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: 20/07/2006
 * Time: 16:53:31
 * To change this template use File | Settings | File Templates.
 */
public class StMap<K extends SmObject, V extends SmObject> extends SmObject {
        // implements StMap<K,V>, Cloneable, Serializable{

  protected final java.util.Map<K,V> map;
  protected final V nil;   // A mil object to return instead of NULL

  /***********************************************************
   *   (private) constructors
   ***********************************************************/

  private StMap(java.util.Map<K,V> map, V nil) {
    this.map = map;
    this.nil = nil;
  }

  /***********************************************************
   *   getInstance
   ***********************************************************/

  public  static  StMap getInstance(java.util.Map map, SmObject nil) {
    return new StMap(map, nil);
  }

  /***********************************************************
   *   methods
   ***********************************************************/

  /**
   * Returns the number of key-value mappings in this map.  If the
   * map contains more than <tt>StInteger.MAX_VALUE</tt> elements, returns
   * <tt>StInteger.MAX_VALUE</tt>.
   *
   * @return the number of key-value mappings in this map.
   */
  public StNumber size() {
    return StNumber.getInstance(map.size());
  }

  /**
   * Returns <tt>true</tt> if this map contains no key-value mappings.
   *
   * @return <tt>true</tt> if this map contains no key-value mappings.
   */
  public Boolean isEmpty() {
    return Boolean.getInstance(map.isEmpty());
  }

  /**
   * Returns <tt>true</tt> if this map contains a mapping for the specified
   * key.  More formally, returns <tt>true</tt> if and only if
   * this map contains a mapping for a key <tt>k</tt> such that
   * <tt>(key==null ? k==null : key.equals(k))</tt>.  (There can be
   * at most one such mapping.)
   *
   * @param key key whose presence in this map is to be tested.
   * @return <tt>true</tt> if this map contains a mapping for the specified
   *         key.
   * @throws ClassCastException   if the key is of an inappropriate type for
   *                              this map (optional).
   * @throws NullPointerException if the key is <tt>null</tt> and this map
   *                              does not permit <tt>null</tt> keys (optional).
   */
  public Boolean containsKey(SmObject key) {
    return Boolean.getInstance(map.containsKey(key));
  }

  /**
   * Returns <tt>true</tt> if this map maps one or more keys to the
   * specified value.  More formally, returns <tt>true</tt> if and only if
   * this map contains at least one mapping to a value <tt>v</tt> such that
   * <tt>(value==null ? v==null : value.equals(v))</tt>.  This operation
   * will probably require time linear in the map size for most
   * implementations of the <tt>StMap</tt> interface.
   *
   * @param value value whose presence in this map is to be tested.
   * @return <tt>true</tt> if this map maps one or more keys to the
   *         specified value.
   * @throws ClassCastException   if the value is of an inappropriate type for
   *                              this map (optional).
   * @throws NullPointerException if the value is <tt>null</tt> and this map
   *                              does not permit <tt>null</tt> values (optional).
   */
  public Boolean containsValue(SmObject value) {
    return Boolean.getInstance(map.containsValue(value));
  }

  /**
   * Returns the value to which this map maps the specified key.  Returns
   * <tt>null</tt> if the map contains no mapping for this key.  A return
   * value of <tt>null</tt> does not <i>necessarily</i> indicate that the
   * map contains no mapping for the key; it's also possible that the map
   * explicitly maps the key to <tt>null</tt>.  The <tt>containsKey</tt>
   * operation may be used to distinguish these two cases.
   * <p/>
   * <p>More formally, if this map contains a mapping from a key
   * <tt>k</tt> to a value <tt>v</tt> such that <tt>(key==null ? k==null :
   * key.equals(k))</tt>, then this method returns <tt>v</tt>; otherwise
   * it returns <tt>null</tt>.  (There can be at most one such mapping.)
   *
   * @param key key whose associated value is to be returned.
   * @return the value to which this map maps the specified key, or
   *         <tt>null</tt> if the map contains no mapping for this key.
   * @throws ClassCastException   if the key is of an inappropriate type for
   *                              this map (optional).
   * @throws NullPointerException if the key is <tt>null</tt> and this map
   *                              does not permit <tt>null</tt> keys (optional).
   * @see #containsKey(SmObject)
   */
  public V get(SmObject key) {
    V v = map.get(key);
    return v == null ? nil : v;
  }

  /**
   * Associates the specified value with the specified key in this map
   * (optional operation).  If the map previously contained a mapping for
   * this key, the old value is replaced by the specified value.  (A map
   * <tt>m</tt> is said to contain a mapping for a key <tt>k</tt> if and only
   * if {@link #containsKey(SmObject) m.containsKey(k)} would return
   * <tt>true</tt>.))
   *
   * @param k   key with which the specified value is to be associated.
   * @param v value to be associated with the specified key.
   * @return previous value associated with specified key, or <tt>null</tt>
   *         if there was no mapping for key.  A <tt>null</tt> return can
   *         also indicate that the map previously associated <tt>null</tt>
   *         with the specified key, if the implementation supports
   *         <tt>null</tt> values.
   * @throws UnsupportedOperationException if the <tt>put</tt> operation is
   *                                       not supported by this map.
   * @throws ClassCastException            if the class of the specified key or value
   *                                       prevents it from being stored in this map.
   * @throws IllegalArgumentException      if some aspect of this key or value
   *                                       prevents it from being stored in this map.
   * @throws NullPointerException          if this map does not permit <tt>null</tt>
   *                                       keys or values, and the specified key or value is
   *                                       <tt>null</tt>.
   */
  public V put(K k, V v) {
    V value = map.put(k, v);
    return value == null ? nil : value;
  }

  /**
   * Removes the mapping for this key from this map if it is present
   * (optional operation).   More formally, if this map contains a mapping
   * from key <tt>k</tt> to value <tt>v</tt> such that
   * <code>(key==null ?  k==null : key.equals(k))</code>, that mapping
   * is removed.  (The map can contain at most one such mapping.)
   * <p/>
   * <p>Returns the value to which the map previously associated the key, or
   * <tt>null</tt> if the map contained no mapping for this key.  (A
   * <tt>null</tt> return can also indicate that the map previously
   * associated <tt>null</tt> with the specified key if the implementation
   * supports <tt>null</tt> values.)  The map will not contain a mapping for
   * the specified  key once the call returns.
   *
   * @param key key whose mapping is to be removed from the map.
   * @return previous value associated with specified key, or <tt>null</tt>
   *         if there was no mapping for key.
   * @throws ClassCastException            if the key is of an inappropriate type for
   *                                       this map (optional).
   * @throws NullPointerException          if the key is <tt>null</tt> and this map
   *                                       does not permit <tt>null</tt> keys (optional).
   * @throws UnsupportedOperationException if the <tt>remove</tt> method is
   *                                       not supported by this map.
   */
  public V remove(SmObject key) {
    V v = map.remove(key);
//    v = NullChecker.getInstance(v).
//            ifTrueElse(nil, v);  // TODO
    return v == null ? nil: v;   // IF
  }

  /**
   * Copies all of the mappings from the specified map to this map
   * (optional operation).  The effect of this call is equivalent to that
   * of calling {@link #put(SmObject,SmObject) put(k, v)} on this map once
   * for each mapping from key <tt>k</tt> to value <tt>v</tt> in the
   * specified map.  The behavior of this operation is unspecified if the
   * specified map is modified while the operation is in progress.
   *
   * @param map Mappings to be stored in this map.
   * @throws UnsupportedOperationException if the <tt>putAll</tt> method is
   *                                       not supported by this map.
   * @throws ClassCastException            if the class of a key or value in the
   *                                       specified map prevents it from being stored in this map.
   * @throws IllegalArgumentException      some aspect of a key or value in the
   *                                       specified map prevents it from being stored in this map.
   * @throws NullPointerException          if the specified map is <tt>null</tt>, or if
   *                                       this map does not permit <tt>null</tt> keys or values, and the
   *                                       specified map contains <tt>null</tt> keys or values.
   */
  public VoidObject putAll(java.util.Map map) {
    this.map.putAll(map);
    return VoidObject.getInstance();    
  }

  /**
   * Removes all mappings from this map (optional operation).
   *
   * @throws UnsupportedOperationException clear is not supported by this
   *                                       map.
   */
  public VoidObject clear() {
    map.clear();
    return VoidObject.getInstance();
  }

  /**
   * Returns a set view of the keys contained in this map.  The set is
   * backed by the map, so changes to the map are reflected in the set, and
   * vice-versa.  If the map is modified while an iteration over the set is
   * in progress (except through the iterator's own <tt>remove</tt>
   * operation), the results of the iteration are undefined.  The set
   * supports element removal, which removes the corresponding mapping from
   * the map, via the <tt>Iterator.remove</tt>, <tt>StSet.remove</tt>,
   * <tt>removeAll</tt> <tt>retainAll</tt>, and <tt>clear</tt> operations.
   * It does not support the add or <tt>addAll</tt> operations.
   *
   * @return a set view of the keys contained in this map.
   */
  public StSet<K> keySet() {
    return StSet.getInstance(map.keySet(), nil);
  }

  /**
   * Returns a collection view of the values contained in this map.  The
   * collection is backed by the map, so changes to the map are reflected in
   * the collection, and vice-versa.  If the map is modified while an
   * iteration over the collection is in progress (except through the
   * iterator's own <tt>remove</tt> operation), the results of the
   * iteration are undefined.  The collection supports element removal,
   * which removes the corresponding mapping from the map, via the
   * <tt>Iterator.remove</tt>, <tt>Collection.remove</tt>,
   * <tt>removeAll</tt>, <tt>retainAll</tt> and <tt>clear</tt> operations.
   * It does not support the add or <tt>addAll</tt> operations.
   *
   * @return a collection view of the values contained in this map.
   */
  public Collection values() {
    return Collection.getInstance(map.values(), nil);
  }

  /**
   * Returns a set view of the mappings contained in this map.  Each element
   * in the returned set is a {@link java.util.Map.Entry}.  The set is backed by the
   * map, so changes to the map are reflected in the set, and vice-versa.
   * If the map is modified while an iteration over the set is in progress
   * (except through the iterator's own <tt>remove</tt> operation, or through
   * the <tt>setValue</tt> operation on a map entry returned by the iterator)
   * the results of the iteration are undefined.  The set supports element
   * removal, which removes the corresponding mapping from the map, via the
   * <tt>Iterator.remove</tt>, <tt>StSet.remove</tt>, <tt>removeAll</tt>,
   * <tt>retainAll</tt> and <tt>clear</tt> operations.  It does not support
   * the <tt>add</tt> or <tt>addAll</tt> operations.
   *
   * @return a set view of the mappings contained in this map.
   */
//  public StSet<Entry<K, V>> entrySet() {
//    return null;  //To change body of implemented methods use File | Settings | File Templates.
//  }


}
