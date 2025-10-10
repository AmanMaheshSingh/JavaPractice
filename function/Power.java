//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 𝑥^n.
import java.util.*;

class Power{
    public static void Power(int x , int n) {
        int p = 1;
        for(int i = 1 ;i<=n;i++){
            p*=x;
        }
        System.out.println( x+"^"+n+" is "+p);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of x and n");
        int x = sc.nextInt() , n = sc.nextInt(); 
        Power(x, n);
    }
}