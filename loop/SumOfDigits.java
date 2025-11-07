//Sum Of A Digits Of Number
import java.util.*;

public class SumOfDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt(),sum=0;
        int length = String.valueOf(n).length();
        for(int i = 1 ; i <= length ; i++){
            sum+=(n%10);
            n/=10;
        }
        System.out.println("Sum : "+sum);
    }
}