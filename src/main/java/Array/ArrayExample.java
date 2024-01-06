package Array;

public class ArrayExample {
   private int a=10;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    protected void display(int[] result){

        for(int i=0;i< result.length;i++){
            System.out.print(result[i]);
        }
    }
    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        arrayExample.setA(30);
        System.out.println("a within class---"+arrayExample.getA());
        int arr1[]=new int[10];
//       display(arr1);

    }
}

class B1 extends ArrayExample{


    public static void main(String[] args){
        B1 b = new B1();
        int arr1[]=new int[10];
        System.out.println("b extends arrayexample---");
        b.display(arr1);

    }
}
