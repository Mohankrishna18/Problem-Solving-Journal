package Day12;

public class QuickSort {

    int partition(int[] arr,int low,int high){

        int pivot = arr[high];   //piot last index
        int i = (low - 1);    // index of smallest element

        for(int j = low; j< high;j++){
            if(arr[j] <= pivot){
                i++;
                //swap arr[i] and arr[j]
                int temp =  arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    void sort(int[] arr,int low,int high){
        if(low < high){
            int pi = partition(arr,low,high);

            sort(arr,low, pi - 1);
            sort(arr,pi+1,high);
        }
    }

     static void printArray(int arr[]) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {10, 7, 8, 9, 1, 5};
        System.out.println("Given Array:");
        printArray(arr);

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, arr.length-1);
         System.out.println("\nSorted Array:");
        printArray(arr);
    }
    
}
