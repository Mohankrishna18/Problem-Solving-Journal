

import java.util.*;

public class BucketSortExample {
    // Bucket Sort function
    public static void bucketSort(float[] arr) {
        int n = arr.length;
        if (n <= 0) return;

        // Create n empty buckets
        @SuppressWarnings("unchecked")
        List<Float>[] buckets = new List[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Put array elements into different buckets
        for (float value : arr) {
            int bucketIndex = (int) (n * value); // distribution
            buckets[bucketIndex].add(value);
        }

        // Sort each bucket individually
        for (List<Float> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Concatenate all buckets into arr[]
        int index = 0;
        for (List<Float> bucket : buckets) {
            for (float value : bucket) {
                arr[index++] = value;
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        float[] arr = {0.42f, 0.32f, 0.23f, 0.52f, 0.25f, 0.47f, 0.51f};

        System.out.println("Original array: " + Arrays.toString(arr));

        bucketSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
