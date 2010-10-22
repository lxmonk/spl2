package ac.bgu.cs.smalltalk.number;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: 20/07/2006
 * Time: 19:02:52
 * To change this template use File | Settings | File Templates.
 */
public class StInteger extends StNumber {

  protected int value;

  /***********************************************************
    *   (private) constructors
    ***********************************************************/

   private StInteger (int v) {
     super();
     value =  v;
   }

   /***********************************************************
    *   getInstance
    ***********************************************************/


  public static StInteger getInstance(int v) {
     return new StInteger(v);
  }

  public static StInteger getInstance(java.lang.Integer v) {
     return new StInteger(v.intValue());
  }

}
