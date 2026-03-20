package Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "blueberry", "avocado");

        List<String> filterWords = words.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

                System.out.println(filterWords);

                
    }   
}
