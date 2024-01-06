import java.util.Calendar;
import java.util.Date;

class Box{
    int height;
    int width;
}
public class Practice {

    public int sum(){
        return 1;
    }
    public int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Box b1=new Box();
        Box b2=b1;
        b2.height=10;
        b1.height=20;
        b1.width=30;
        System.out.println(b1.height);
        System.out.println(b2.height);
        System.out.println(b1.width);
        System.out.println(b2.width);

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());

        int numOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
        System.out.println("Number of days" +numOfDays);
        Practice practice = new Practice();
        practice.sum();
        practice.sum(2,4);


    }
}
