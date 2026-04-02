package Day14;

import java.util.stream.*;
import java.util.*;

public class StreamApi {
    public static void main(String[] args){
         List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );
        List<Integer> flattened = listOfLists.stream()
                                             .flatMap(List::stream)
                                             .collect(Collectors.toList());
                                System.out.println(flattened);
    }
}
