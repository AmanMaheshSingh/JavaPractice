//Write a function to print the sum of all odd numbers from 1 to 10.
import java.util.*;

class OddNum{

    public static void OddSum(int n) {
        int s = 0 ;
        for(int i = 1;i<=n;i++){
            if(i%2!=0)
                s+=i;
        }
        System.out.println("The Sum of All Odd Numbers till n is " + s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of n");
        int n = sc.nextInt(); 
        OddSum(n);     
    }
}