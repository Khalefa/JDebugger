import java.util.*;

public class JDIExampleDebuggee {
  public static void main(String[] args) {
    LinkedList<Integer> a = new LinkedList<>();
    int[] arr = new int[10];

    Integer integer = 10;
    /*1*/ String jpda = "--Java Platform Debugger Architecture  ";
    System.out.println("Line 1" + jpda);
    /*2*/ System.out.println("Hi Everyone, Welcome to " + jpda); // add a break point here
    System.out.println("Line 2");
    /*3*/ String jdi = "Java Debug Interface"; // add a break point here and also stepping in here
    System.out.println("Line 3" + jdi);
    /*4*/ String text = "Today, we'll dive into " + jdi;
    System.out.println("Line 4");

    /*5*/ for (int i = 0; i < 10; i++) {
      System.out.println("Line 5" + i);

      /*6*/ System.out.println(i + "-" + text);
      System.out.println("Line 6");
    }
  }
}
