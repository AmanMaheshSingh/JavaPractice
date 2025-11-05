//Find if a number is palindrome or not
import java.util.*;

public class Palindrome{
   public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Number To Check ");
        int n=sc.nextInt();
        String scr=Integer.toString(n);
        StringBuilder S = new StringBuilder(scr);
        S.reverse();
        String revString = S.toString();
        int num=Integer.parseInt(revString);
        if(n==num){
            System.out.println(n+" is a Palindrome");
        }else{
            System.out.println(n+" is a Not Palindrome");
        }
    }
}