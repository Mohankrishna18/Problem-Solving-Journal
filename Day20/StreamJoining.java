package Day20;

import java.util.stream.*;
import java.util.*;

public class StreamJoining {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Java", "Python", "C++");
      String result = list.stream()
                          .collect(Collectors.joining(", "));
                System.out.println(result);
    }
}

// Given a list of strings: ["Java", "Python", "C++"]

// Use Streams with Collectors.joining(", ") to join them into a single string.

// Print the result.