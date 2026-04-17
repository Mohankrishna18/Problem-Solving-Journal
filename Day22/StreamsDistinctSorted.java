package Day22;

import java.util.stream.*;
import java.util.*;

public class StreamsDistinctSorted {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(5, 3, 2, 5, 4, 2, 1);

        List<Integer> result = list.stream()
                                   .distinct()
                                   .sorted()
                                   .collect(Collectors.toList());
                    System.out.println(result);
}
}