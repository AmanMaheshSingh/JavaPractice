//Fibonacci Series In Java Programs
import java.util.*;

public class FibonacciSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt(),first=0,second=1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first+" ");
            int temp = first + second;
            first = second;
            second = temp;
        }
    }
}