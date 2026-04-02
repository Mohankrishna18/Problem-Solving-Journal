package Day13;

import java.util.stream.*;
import java.util.*;
public class DSAProblem {
    public static void main(String[] args){
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        // Step 1: Find the maximum value
        int max = Arrays.stream(arr).max().getAsInt();

        // Step 2: Initialize count array
        int[] count = new int[max + 1];

        // Step 3: Count occurrences
        for(int num : arr){
            count[num]++;
        }
 // Step 4: Build the sorted array
        int[] output = new int[arr.length];
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                output[index++] = i;
                count[i]--;
            }
        }

        // Step 5: Print result
        System.out.println("Sorted array: " + Arrays.toString(output));
    }
}
