//To calculate Fibonacci Series up to n numbers.
import java.util.*;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Value of n");
        int n = sc.nextInt(),first = 0,second= 1;
        for(int i = 1;i <= n;i++){
            System.out.print(first+" ");
            int next = first + second;
            first = second ;
            second = next;
        }
    }
}