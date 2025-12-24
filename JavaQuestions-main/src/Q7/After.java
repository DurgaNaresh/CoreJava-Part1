package Q7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class After {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");
    names.add("Chetan");

    Iterator<String> itr = names.iterator();
    while (itr.hasNext()) {
      if (itr.next().equals("Bob")) {
        itr.remove(); // this is safe
      }
    }

    System.out.println(names);
  }
}
