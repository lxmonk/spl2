package ac.bgu.cs.smalltalk.context;

import ac.bgu.cs.smalltalk.base.SmObject;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: 21/07/2006
 * Time: 02:28:47
 * To change this template use File | Settings | File Templates.
 */
public abstract  class Context extends SmObject {

  protected Context() {
  }

  public abstract SmObject value(SmObject... args);


}
