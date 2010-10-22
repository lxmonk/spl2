package ac.bgu.cs.smalltalk.base;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: 19/07/2006
 * Time: 21:04:22
 * To change this template use File | Settings | File Templates.
 */
public class NilObject extends SmObject {

  protected NilObject() {
    super();
  }
  
  public static NilObject getInstance() {
    return new NilObject();
  }

}
