//To find out whether the given String is Palindrome or not.
import java.util.*;

public class PalindromeString{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The String To Check ");
        String scr=sc.nextLine();
        StringBuilder S = new StringBuilder(scr);
        S.reverse();
        String revString = S.toString();
        if(scr.equals(revString)){
            System.out.println(scr+" is a Palindrome");
        }else{
            System.out.println(scr+" is a Not Palindrome");
        }
    }
}