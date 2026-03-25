package Day6;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

public class Problem2 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("apple", "banana", "apricot", "blueberry", "avocado", "blackberry");

        Map<Character,List<String>> result = list.stream()
          .collect(Collectors.groupingBy(word -> word.charAt(0)));

          result.forEach((letter, l) -> 
        System.out.println(letter + " -> " + l));
    }
}
