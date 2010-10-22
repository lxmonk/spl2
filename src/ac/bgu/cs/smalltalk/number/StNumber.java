package ac.bgu.cs.smalltalk.number;

import ac.bgu.cs.smalltalk.base.SmObject;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: 20/07/2006
 * Time: 17:00:37
 * To change this template use File | Settings | File Templates.
 */
public class StNumber extends SmObject{

  /***********************************************************
    *   (private) constructors
    ***********************************************************/

   protected  StNumber () {
   }

   /***********************************************************
    *   getInstance
    ***********************************************************/

  public static StNumber getInstance(int v) {
     return StInteger.getInstance(v);
  }

  public static StNumber getInstance(java.lang.Integer v) {
     return StInteger.getInstance(v);
  }


}
