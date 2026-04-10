package Day18;

import java.util.stream.*;
import java.util.*;

public class StreamToMapExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");

        Map<String, Integer> fruitMap = fruits.stream()
                                              .collect(Collectors.toMap(str -> str, str -> str.length()));
                        System.out.println(fruitMap);
    }
}
