import java.util.Scanner;

public class Practice2 {

    public void findEven(int number){
        int quotient =  number /2;
        if(quotient*2 == number){
            System.out.println("Even number ");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
     Practice2 p2 = new Practice2();
        System.out.println("Enter a number: ");
        int num = new Scanner(System.in).nextInt();
        p2.findEven(num);
    }
}
