package Q3;

import java.util.*;

public class Before {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3);

    System.out.println(numbers); //[1, 2, 3]

    //What is the output of this code?

    try {
      numbers.add(4);
      System.out.println("added");
    } catch(Exception ex) {
      System.out.println("Add Unsupported");
    }

    try {
      numbers.set(2, 2);
      System.out.println("set");
    } catch(Exception ex) {
      System.out.println(" Set Unsupported");
    }

    System.out.println(numbers);
  }
}

