package Day15;

import java.util.stream.*;
import java.util.*;

public class StreamApi {
    public static void main(String[] args){
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    Map<Boolean,List<Integer>> result = numbers.stream()
                                               .collect(Collectors.partitioningBy(x -> x / 2==0));
            System.out.println("Even list :"+ result.get(true));
            System.out.println(" Odd list :"+result.get(false));
}
}