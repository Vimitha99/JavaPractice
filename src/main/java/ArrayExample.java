public class ArrayExample {
    public void display(int[] result){
        for(int i=0;i< result.length;i++){
            System.out.println(result[i]);
        }
    }
    public static void main(String[] args) {
        int arr1[]=new int[10];

        ArrayExample obj=new ArrayExample();
        obj.display(arr1);

    }
}
