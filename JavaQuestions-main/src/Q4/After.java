package Q4;

import java.util.*;

//What is wrong with this code?

public class After {
  public static void main(String[] args) {
    List<String> names = List.of("Pushpa", "Shrivalli", "Kesava", "Srinu", "Konda", "Jakka", "Jaali");
    List<String> inUppercase = new ArrayList<>();
    //for(int i=0;i<100;i++) {

    List<String> list = names.parallelStream()
            .map(String::toUpperCase)
            .toList();

    System.out.println(names.size());
    System.out.println(list.size());
  }
  // }

}

//The lambda in forEach is impure. If we change stream() to parallelStream() the result of
//the output is unpredictable. Run it many times, you may not see 7 and 7 as the output in some
//of the runs. Race condition may result in loss of data.

