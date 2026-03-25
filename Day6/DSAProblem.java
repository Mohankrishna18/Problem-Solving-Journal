package Day6;


//Binary Search on a sorted array
public class DSAProblem {

    public static int binarySearch(int[] numbers, int target){
        int left = 0;
        int right = numbers.length-1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(numbers[mid] == target){
                return mid; //found
            }else if(numbers[mid] < target){
                    left = mid + 1;  //search half right
            }else{
                right = mid - 1;  //search half left
            }
        }
        return -1; // not found
    }
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50, 60};
        int target = 40;
        
        int result = binarySearch(numbers, target);

        if(result != -1){
            System.out.println("Element " + target + " found at index: " + result);
        }else{
            System.out.println("Not found");
        }
    }
}
