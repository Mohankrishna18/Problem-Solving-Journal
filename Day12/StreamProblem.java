package Day12;

import java.util.stream.*;
import java.util.*;

public class StreamProblem {
    public static void main(String[] args) {
        // Create the list
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int total =  numbers.parallelStream()
                            .mapToInt(n -> n * n)
                            .sum();
                
                            System.out.println(total);
}
}