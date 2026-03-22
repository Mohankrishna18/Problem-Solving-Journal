import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Problem2 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(45, 12, 78, 34, 23, 89);
        List<Integer> result = numbers.stream()
                                      .sorted()
                                      .collect(Collectors.toList());
                            System.out.println(result);

    }
}
