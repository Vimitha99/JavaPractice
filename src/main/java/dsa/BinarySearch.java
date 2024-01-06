package dsa;

public class BinarySearch {
    public static int binarySearch(int[] array,int target){ //without recursion
        int low=0;
        int high = array.length-1;

        while(low<=high){
            int mid= (low+high)/2;
            if(array[mid] == target){
                return mid;
            }
            else if(target > array[mid]){
                low = mid +1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;

    }

    public static int binarySearchRecursive(int[] arr,int low,int high,int target){ // with recursion
        if(high>=1){
            int mid=low+(high-low)/2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                return binarySearchRecursive(arr, mid + 1, high, target);
            } else {
                return binarySearchRecursive(arr, low, mid - 1, target);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,7,9,10};

        //without recursion
        int result= binarySearch(arr,7);
        System.out.println(result);

        //with recursive function
        System.out.println(binarySearchRecursive(arr,0,arr.length-1,9));



    }
}
