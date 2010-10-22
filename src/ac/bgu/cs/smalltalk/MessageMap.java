package ac.bgu.cs.smalltalk;

import ac.bgu.cs.smalltalk.base.SmObject;

import ac.bgu.cs.smalltalk.base.NilObject;
import ac.bgu.cs.smalltalk.java.StMap;
import ac.bgu.cs.smalltalk.java.StString;
import ac.bgu.cs.smalltalk.context.Context;
//import ac.bgu.cs.smalltalk.context.ContextMethod;
import ac.bgu.cs.smalltalk.context.NilContext;


/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: 23/07/2006
 * Time: 22:15:00
 * To change this template use File | Settings | File Templates.
 */
public class MessageMap extends SmObject {

  protected StMap names;

  protected MessageMap() {
    this.names =  StMap.getInstance(new java.util.HashMap(), NilContext.getInstance());
  }

  public Context put(Context method) {
    StMap args = StMap.getInstance(new java.util.HashMap(), NilContext.getInstance());
//    args.put(method.hashCode(), method);
                              return null;
  }


}
