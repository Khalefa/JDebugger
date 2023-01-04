This is **Deprecated** please use Jtracer instead



Inspecting Stack Variables:

Stack variables, and specifically their values at your breakpoint, are associated with the JDI StackFrame and Frame classes. They are referred to as LocalVariables in JDI, you get reach them through the BreakpointEvent, by accessing its ThreadReference, then the StackFrame at the top level (that is, element #0) of the stack. You can then query the visible variables on the StackFrame by name to find the target variable. In other words, you could do something like this:

 StackFrame stackFrame = breakpointEvt.thread().frame(0);
 LocalVariable localVar = stackFrame.visibleVariableByName(varName);
 Value val = stackFrame.getValue(localVar);

Working with classes

https://stackoverflow.com/questions/59010599/jdi-how-to-get-the-objectreference-value
https://docs.oracle.com/en/java/javase/11/docs/api/jdk.jdi/com/sun/jdi/ObjectReference.html


https://docs.oracle.com/en/java/javase/11/docs/api/jdk.jdi/com/sun/jdi/LocalVariable.html

 javac  -cp /Library/Java/JavaVirtualMachines/jdk1.8.0_221.jdk/Contents/Home/lib/tools.jar:. edu/suny/jdi/JDebugger.java


 javac  -g examples/JDIExampleDebuggee.java
 javac  -g examples/Debuggee.java


java -cp /Library/Java/JavaVirtualMachines/jdk1.8.0_221.jdk/Contents/Home/lib/tools.jar:. edu.suny.jdi.JDebugger JDIExampleDebuggee
