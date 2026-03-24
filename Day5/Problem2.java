package Day5;

import java.util.*;
import java.util.stream.*;

public class Problem2 {
    public static void main(String[] args){
    List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

    int sum = numbers.stream()
                     .reduce(0,(a,b) -> a + b);
               
      System.out.println(sum);
    }
}
