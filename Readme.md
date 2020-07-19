The last working code is JDEbugger



Inspecting Stack Variables:

Stack variables, and specifically their values at your breakpoint, are associated with the JDI StackFrame and Frame classes. They are referred to as LocalVariables in JDI, you get reach them through the BreakpointEvent, by accessing its ThreadReference, then the StackFrame at the top level (that is, element #0) of the stack. You can then query the visible variables on the StackFrame by name to find the target variable. In other words, you could do something like this:

 StackFrame stackFrame = breakpointEvt.thread().frame(0);
 LocalVariable localVar = stackFrame.visibleVariableByName(varName);
 Value val = stackFrame.getValue(localVar);



To compile:
 javac  -cp /Library/Java/JavaVirtualMachines/jdk1.8.0_221.jdk/Contents/Home/lib/tools.jar:. edu/suny/jdi/JDebugger.java


 javac  -g examples/JDIExampleDebuggee.java
 javac  -g examples/Debuggee.java



To run":

java -cp /Library/Java/JavaVirtualMachines/jdk1.8.0_221.jdk/Contents/Home/lib/tools.jar:. edu.suny.jdi.JDebugger JDIExampleDebuggee