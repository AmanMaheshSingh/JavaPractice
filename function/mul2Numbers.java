//Make a function to multiply 2 Numbers and Return The Product
import java.util.*;

class mul2Numbers{
    public static int Mul(int a,int b) {
        int p = a*b;
        return p;    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt(),b=sc.nextInt();
        int prod = Mul(a,b);
        System.out.println(prod);
    }
}