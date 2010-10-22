package ac.bgu.cs.smalltalk.base;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: 23/07/2006
 * Time: 19:31:40
 * To change this template use File | Settings | File Templates.
 */
public class VoidObject extends SmObject {

  protected VoidObject() {
  }

  public static VoidObject getInstance() {
    return new VoidObject();
  }
}
