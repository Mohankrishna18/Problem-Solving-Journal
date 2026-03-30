package Day8;


 // Bubble Sort algorithm
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        int n = arr.length;
        // Bubble Sort algorithm
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                // Swap if the element is greater than the next
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array : ");
        for(int num : arr){
            System.out.print(num +" ");
        }        

    }
}
