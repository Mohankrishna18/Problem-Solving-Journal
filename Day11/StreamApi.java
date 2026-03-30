package Day11;

import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

        //Check if any number is greater than 8.
        boolean check = list.stream().anyMatch(x -> x > 8);

        //Check if all numbers are even.
        boolean allNum = list.stream().allMatch(x -> x % 2 == 0 );

        System.out.println(" Any number > 8 ? " + check);
        System.out.println("All numbers even ?" + allNum);
    }
    
}
