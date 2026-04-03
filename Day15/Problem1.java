package Day15;

import java.util.*;
import java.util.stream.*;

public class Problem1 {
    public static void main(String[] args){
        String s = "i am learning java stream";
        String ss = "mohan";
       List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
      //int[] arr = {1,1};
      List<String> listOfString = Arrays.asList("mohan","123","nuer","456","kfwo","789");
     
      List<Integer> result =   listOfString.stream()
                                          .filter(x -> x.matches("\\d+"))
                                          .map(Integer::valueOf)
                                          .collect(Collectors.toList());
            System.out.println(result);
    }
}
//15