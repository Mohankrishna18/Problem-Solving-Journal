package Day9;

import java.util.stream.*;
import java.util.*;

public class StreamApi {
    public static void main(String[] args){
        List<String> list = Arrays.asList("apple", "banana", "apricot", "blueberry", "avocado", "blackberry");
        List<String> result = list.stream()
                                  .filter(e -> e.toLowerCase().contains("berry"))
                                  .collect(Collectors.toList());
                    System.out.println(result);
    }
    
}
