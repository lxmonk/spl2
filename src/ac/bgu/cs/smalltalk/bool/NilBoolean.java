package ac.bgu.cs.smalltalk.bool;

import ac.bgu.cs.smalltalk.base.SmObject;
import ac.bgu.cs.smalltalk.context.Context;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: 19/07/2006
 * Time: 21:04:30
 * To change this template use File | Settings | File Templates.
 */
public class NilBoolean extends Boolean {

  public SmObject ifTrue(Context context) {
    return null; 
  }

  public SmObject ifFalse(Context context) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }


}
