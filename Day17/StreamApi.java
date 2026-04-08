package Day17;


import java.util.*;
public class StreamApi {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using reduce to calculate product
        int product = numbers.stream()
                             .reduce(1, (a, b) -> a * b);

        System.out.println("Product of numbers: " + product);

        
    }
}
