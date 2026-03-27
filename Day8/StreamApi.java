package Day8;

import java.util.stream.*;
import java.util.*;

public class StreamApi {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Java", "Python", "C++", "Go");

        String result = list.stream()
                                  .collect(Collectors.joining(", "));
                                


        System.out.println(result);
    }
    
}
