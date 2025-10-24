//Write a program to count the number of 1’s in a binary representation of the number.
import java.util.*;

class Count1s{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) { 
                count++;
            }
            n = n >> 1; 
        }
        System.out.println("Number of 1's in binary representation: " + count);
    }
}