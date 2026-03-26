package Day7;

public class DSAProblem {

    public static int binarySearch(int[] arr,int left, int right, int target){
        if(left > right){
            return -1;
        }
        int mid = left +(right - left)/2;

        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            return binarySearch(arr,mid -1,right, target);
        }else{
            return binarySearch(arr,mid + 1, right,target);
        }
    }
    public static void main(String[] args){
        int[] arr = {5, 10, 15, 20, 25, 30};
        int target = 25;

        int result =  binarySearch(arr,0,arr.length-1,target);

        if(result != -1){
            System.out.println("Element found at index number : "+ result);
        }else{
            System.out.println("Not found...");
        }
    }
    
}
