package Day7;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

public class StreamApi {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = list.stream()
                                   .map(s -> s*s)
                                   .collect(Collectors.toList());
                System.out.println(result);
    }

}
