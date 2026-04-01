package Day13;

import java.util.*;
import java.util.stream.*;

public class Streams {
    public static void main(String[] args){
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String,Long> result = list.stream()
                                      .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
           result.forEach((a,b) -> System.out.println(a + " -> " + b));
    }
}
