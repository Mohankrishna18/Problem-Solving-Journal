

public class SelectionSort {

    public static void selectionSort(int[] arr){
        int len = arr.length;

        for(int i = 0;i < len-1; i++){
            int minId = i;
            for(int j = i+1; j < len ;j++){
                if(arr[j] < arr[minId]){
                        minId = j;
                }
        }
        int temp = arr[minId];
            arr[minId] = arr[i];
            arr[i] = temp;
    }
    }

    public static void main(String[] args){
        int[] arr = {64, 25, 12, 22, 110};

        selectionSort(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    
}
