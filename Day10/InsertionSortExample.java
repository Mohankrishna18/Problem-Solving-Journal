package Day10;

public class InsertionSortExample {

    public static void inserstionSort(int[] arr){
        int n = arr.length;
        for(int i = 1;i < n; i++){
            int key = arr[i];           // element to be inserted    
            int j = i - 1;               
            
            // Shift elements greater than key to one position ahead
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];    
                j = j - 1;
            }
            arr[j + 1] = key;    // place key at correct position
                            
        }
    }
    public static void main(String[] args){
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Original array:"); 

        for(int a : arr){
        System.out.print(" " + a);
        }
        inserstionSort(arr);
        System.out.println("\nSorted array:");
        for(int a : arr){
        System.out.print(" " + a);
        }
    }
        
}