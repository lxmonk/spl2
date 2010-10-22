package ac.bgu.cs.smalltalk.base;

import ac.bgu.cs.smalltalk.java.StString;
import ac.bgu.cs.smalltalk.java.StMap;
import ac.bgu.cs.smalltalk.java.StSet;
import ac.bgu.cs.smalltalk.context.Context;
//import ac.bgu.cs.smalltalk.context.ContextMethod;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: admin
 * Date: 24/07/2006
 * Time: 16:33:43
 * To change this template use File | Settings | File Templates.
 */
public class StClass extends SmObject {

  private static final StClass ROOT_CLASS = new StClass(StString.getInstance("StClass"));
  protected StString className;
  protected StClass classSuper;
  protected StSet variables;
  protected StSet methods;

  protected StClass(StString aClassName) {
    this(null, aClassName);
    this.classSuper = this;   // correct the NULL
  }

  protected StClass(StClass aClassSuper, StString aClassName) {
    this.className = aClassName;
    this.classSuper = aClassSuper;
    variables = StSet.getInstance(new HashSet(), NilObject.getInstance());
  }

  public static StClass getInstance () {
    return ROOT_CLASS;
  }

  public StClass subclass(StString name) {
    return new StClass(this, name);
  }

  public VoidObject addVariable(StString varName) {
    variables.add(varName);
    return VoidObject.getInstance();
  }

  public VoidObject addMethod(Context method) {
    methods.add(method);
    return VoidObject.getInstance();
  }

  public SmObject createInstance() {

    return VoidObject.getInstance();
  }


}
