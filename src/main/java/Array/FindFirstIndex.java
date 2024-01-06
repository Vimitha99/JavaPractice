package Array;

public class FindFirstIndex {
    private static int findFirstIndex(int[] arr, int x) {
        int low=0,high=arr.length-1;
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid] <x){
                low=mid+1;
            }
            else if(arr[mid] > x){
                high=mid-1;
            }
            else
            {
                res=mid;
                high=mid-1;
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,10,10,20,30,40};
        int x = 10;

        System.out.println(findFirstIndex(arr,x));

    }


}
