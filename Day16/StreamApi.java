import java.util.*;
public class StreamApi {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        // Use summarizingInt to get statistics
        IntSummaryStatistics stats = numbers.stream()
                                    .mapToInt(Integer::intValue)
                                    .summaryStatistics();

        // Print results
        System.out.println("Count = " + stats.getCount());
        System.out.println("Sum = " + stats.getSum());
        System.out.println("Min = " + stats.getMin());
        System.out.println("Average = " + stats.getAverage());
        System.out.println("Max = " + stats.getMax());
    }
}
