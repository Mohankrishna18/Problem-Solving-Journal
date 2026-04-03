package Day15;

import java.util.*;
import java.util.stream.*;

public class Problem1 {
   public static void main(String[] args) {
        // Using StringBuilder (not thread-safe, faster)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.append(" - Using StringBuilder");
        System.out.println(sb.toString());

        // Using StringBuffer (thread-safe, slower due to synchronization)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        sbf.append(" - Using StringBuffer");
        System.out.println(sbf.toString());

        // Performance comparison
        int iterations = 100000;
        long startTime, endTime;

        // StringBuilder performance
        startTime = System.nanoTime();
        StringBuilder sbPerf = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbPerf.append("test");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ns");

        // StringBuffer performance
        startTime = System.nanoTime();
        StringBuffer sbfPerf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbfPerf.append("test");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ns");
    }
}