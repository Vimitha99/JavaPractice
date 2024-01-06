package string;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
      while(i<=j){
          if(str.charAt(i)!=str.charAt(j))
              return false;
          i++;
          j--;
      }
      return true;
    }
    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String lowerStr = str.toLowerCase();
        if(Palindrome.isPalindrome(lowerStr))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
