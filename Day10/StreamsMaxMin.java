package Day10;

import java.util.stream.*;
import java.util.*;

public class StreamsMaxMin  {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(12, 45, 67, 23, 89, 34);

        // Find minimum using Streams
        int min = list.stream()
                               .max(Integer::compare)
                               .get();
        // Find maximum using Streams
        int max = list.stream()
                               .min(Integer::compare)
                               .get();
        System.out.println("max value :" + max);
        System.out.println("Min value : "+ min);
    }

    
}
