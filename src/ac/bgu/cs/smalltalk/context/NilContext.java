package ac.bgu.cs.smalltalk.context;

import ac.bgu.cs.smalltalk.base.SmObject;
import ac.bgu.cs.smalltalk.base.SmUnsupportedOperationException;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: 23/07/2006
 * Time: 22:44:46
 * To change this template use File | Settings | File Templates.
 */
public class NilContext extends Context{

  protected NilContext() {
  }

  public static Context getInstance() {
    return new NilContext();
  }

  public SmObject value(SmObject... args) {
    return null; //SmUnsupportedOperationException
  }

}
