import java.sql.Array;
import java.util.*;
interface LambdaDemo{
    void demo();
}

public class ListDemo {

    static class A{
        public void methodA(){

        }

    }
    public static void main(String[] args) {

//        //lambda expression
//        LambdaDemo lambdaDemo=()->{
//            System.out.println("lambda demo");
//        };
//        List<String> list= new ArrayList<>();
//        list.add("Vimitha");
//        list.add("10");
//
//        Map<String,Integer> map = new HashMap<>();
//        map.put("Vimitha",23);
//        map.put("Stafny",24);
//        System.out.println("Printing hashmap "+map);
//
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        lambdaDemo.demo();

//        int a[]= new int[3];
//        a[0]=1;
//        a[2]=2;
//        System.out.println(a.length);
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }

        ArrayList arrayList = new ArrayList();
        arrayList.add(23);
        arrayList.add("Vimitha");
        Iterator it= arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
