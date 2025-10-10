//Make a Function To Add 2 Numbers and Return The Sum
import java.util.*;

class add2Numbers{
    public static int Add(int a,int b) {
        int s = a+b;
        return s;    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt(),b=sc.nextInt();
        int sum = Add(a,b);
        System.out.println(sum);
    }
}