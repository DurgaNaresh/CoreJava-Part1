package Q7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Before {

  public static void main(String[] args) {

      List<String> names = new ArrayList<>();
      names.add("Alice");
      names.add("Bob");
      names.add("Charlie");
     // names.add("Chetan"); //ConcurrentModificationException if you uncomment

      for (String name : names) {
          if (name.equals("Bob")) {
              names.remove(name);
          }
      }
      System.out.println(names);
  }

}

