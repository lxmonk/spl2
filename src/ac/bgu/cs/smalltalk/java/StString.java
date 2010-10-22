package ac.bgu.cs.smalltalk.java;

import ac.bgu.cs.smalltalk.base.SmObject;

/**
 * Created by IntelliJ IDEA.
 * User: ben-elia
 * Date: 21/07/2006
 * Time: 12:19:12
 * To change this template use File | Settings | File Templates.
 */
public class StString extends SmObject {

  protected java.lang.String string;

  protected StString(java.lang.String string) {
    this.string = string;
  }

  public static StString getInstance(java.lang.String string) {
    return new StString(string);
  }



}
