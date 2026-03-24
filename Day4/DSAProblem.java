package Day4;

public class DSAProblem {
    public static void main(String[] args){
        int[]  arr = {5, 2, 9, 1, 5, 6};

        // Initialize min and max with the first element
        int max = arr[0];
        int min = arr[0];

        // Traverse the array

        for(int i=1;i < arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Max value : " + max);
        System.out.println("Min value : "+min);


    }
}
