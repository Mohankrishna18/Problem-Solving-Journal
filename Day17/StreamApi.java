package Day17;

import java.util.stream.*;
import java.util.*;
public class StreamApi {
    public static void main(String[] args){
        //String s = "i am learning java stream api";
       // String s = "hello world";
        //List<Integer> numbers = Arrays.asList(1,2,4,5,3,2,6,7,8);
        //List<Integer> list = Arrays.asList(1,4,5,2,3,6,7,8);
        int[] arr = {1,2,4,5,3,6,8,55,88,};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Map<Integer,List<Integer>> result = list.stream()
                                     .collect(Collectors.groupingBy(x->x/10%10,LinkedHashMap::new,Collectors.toList()));

      System.out.println(result);

        
    }
}
