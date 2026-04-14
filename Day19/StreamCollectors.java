package Day19;

import java.util.stream.*;
import java.util.*;
import java.util.function.Function;
public class StreamCollectors {
    public static void main(String[] args){
            List<String> list = Arrays.asList("apple", "banana", "cherry");
            Map<String,Integer> result = list.stream()
                                          .collect(Collectors.toMap(Function.identity(), String::length));
                    System.out.println(result);
    }
}

// Given a list of strings: ["apple", "banana", "cherry"]

// Use Streams to create a map where the key is the string and the value is its length.

// Print the map.