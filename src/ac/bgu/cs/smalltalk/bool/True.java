package ac.bgu.cs.smalltalk.bool;

import ac.bgu.cs.smalltalk.base.SmObject;
import ac.bgu.cs.smalltalk.base.NilObject;
import ac.bgu.cs.smalltalk.context.Context;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: 19/07/2006
 * Time: 21:04:47
 * To change this template use File | Settings | File Templates.
 */
public class True extends Boolean {

  /***********************************************************
     *   (private) constructors
     ***********************************************************/

    protected  True () {
    }

    /***********************************************************
     *   getInstance
     ***********************************************************/

   public static True getInstance() {
      return new True();
   }


  public SmObject ifTrue(Context context) {
    return context.value();
  }

  public SmObject ifFalse(Context context) {
    return NilObject.getInstance();
  }

}
