package Q1;

import java.util.*;

public class Before {
  public static void main(String[] args) {
    Collection<String> numbers = new ArrayList<String>(List.of("a", "b", "c"));

    System.out.println(numbers); //[1, 2, 3]

    numbers.remove(1);

    System.out.println(numbers); //[1, 3]

    //If we change the List<Integer> above to Collection<Integer> above, what will be the output?
  }
}

