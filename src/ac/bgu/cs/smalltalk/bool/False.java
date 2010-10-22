package ac.bgu.cs.smalltalk.bool;

import ac.bgu.cs.smalltalk.base.SmObject;
import ac.bgu.cs.smalltalk.base.NilObject;
import ac.bgu.cs.smalltalk.context.Context;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: 19/07/2006
 * Time: 21:04:55
 * To change this template use File | Settings | File Templates.
 */
public class False extends Boolean {


  /***********************************************************
     *   (private) constructors
     ***********************************************************/

    protected  False () {
    }

    /***********************************************************
     *   getInstance
     ***********************************************************/

   public static False getInstance() {
      return new False();
   }


  public SmObject ifTrue(Context context) {
    return NilObject.getInstance();
  }

  public SmObject ifFalse(Context context) {
    return context.value();
  }


}
