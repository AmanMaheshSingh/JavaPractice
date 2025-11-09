//Define a program to find out whether a given number is even or odd.
import java.util.*;

public class EvenOdd{
    public static void  Even_Odd(int n){
        if(n%2==0){
            System.out.println("Entered Number is Even");
        }else{
            System.out.println("Entered Number is Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        Even_Odd(num);
    }
}