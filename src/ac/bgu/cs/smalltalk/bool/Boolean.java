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
public abstract class Boolean extends SmObject {

  /***********************************************************
     *   (private) constructors
     ***********************************************************/

    protected  Boolean () {
    }

    /***********************************************************
     *   getInstance
     ***********************************************************/

   public static Boolean getInstance(boolean b) {
      if (b)
        return True.getInstance();
      else
        return False.getInstance();
   }

   public static Boolean getInstance(java.lang.Boolean b) {
      return getInstance(b.booleanValue());
   }

  public abstract SmObject ifTrue(Context context) ;

  public abstract SmObject ifFalse(Context context) ;

}
