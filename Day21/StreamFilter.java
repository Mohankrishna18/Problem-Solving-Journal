package Day21;

import java.util.stream.*;
import java.util.*;

public class StreamFilter {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(5, 10, 15, 20, 25);

        List<Integer> result = list.stream()
                                   .filter(v -> v > 10)
                                   .collect(Collectors.toList());
            System.out.println(result);

    }
}
