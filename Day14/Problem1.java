package Day14;
import java.util.stream.*;
import java.util.*;
public class Problem1 {
    public static void main(String[] args){
       
        //List<String> arr = Arrays.asList("abs","123","kdkw","345","kew","456");
        //String ss = "asksfslncslks";
        //char target = 'a';
      //  String[] str = {"sfkls","kkfwojojw","kfkwokkfklkl"};

      Integer[] arr1 = {1,2,3,4,5};
      Integer[] arr2 = {3,4,5,6,7};

      Set<Integer> se = new HashSet<>(Arrays.asList(arr2));

            
        List<Integer> result = Arrays.stream(arr1).filter(se::contains).collect(Collectors.toList());
                System.out.println(result);
    }
}
