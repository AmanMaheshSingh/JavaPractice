//Find Factorial os a number 
import java.util.*;

class Factorial{
    public static long fact(int n) {
        if(n<=0){
            System.out.println("Error invalid number");
            return 0;
        }
        long f = 1;
        for(int i = 2 ; i<=n;i++){
            f*=i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        long f = fact(N);
        System.out.println(f);
    }
}