package Day4;

import java.util.stream.*;
import java.util.*;
public class Problem2 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> result = numbers.stream()
                                      .distinct()
                                      .collect(Collectors.toList());
                                    

       int uniqcount = result.size();
       System.out.println("Uniqe count : " + uniqcount);
       System.out.println(result);
                                      
    }
    
}
