//Java Program Vowel Or Consonant
import java.util.*;

public class Vowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Letter to Check");
        String s = sc.next();
        char c = s.charAt(0);
        if(c=='a' | c=='e' | c=='i' | c=='o' | c=='u' | c=='A' | c=='E' | c=='I' |c=='O' |c=='U'){
            System.out.println("Vowel");
        }else{
            System.out.println("Constant");
        }
    }
}