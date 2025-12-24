package Q4;

import java.util.*;
import java.util.stream.Collectors;

//What is wrong with this code?

public class Before {
  public static void main(String[] args) {
    List<String> names = List.of("Pushpa", "Shrivalli", "Kesava", "Srinu", "Konda", "Jakka", "Jaali");

    List<String> inUppercase = new ArrayList<>();

    names.stream()
            .map(String::toUpperCase)
            .forEach(name -> inUppercase.add(name));

    System.out.println(names.size());
    System.out.println(inUppercase.size());
  }
}


