package string;

import java.util.Scanner;

public class Reverse {
    public static String reverse(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversedString = Reverse.reverse(str);
        System.out.println("Reveresed string: "+reversedString);

    }
}
