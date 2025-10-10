//Write a function which takes in two numbers and returns the greater of those two.
import java.util.*;

class GreaterNum{

    public static void Greater(int x , int y) {
        if(x>y)
            System.out.println(x+" is Greater Between The Two Given Numbers");
        else if(y>x)
            System.out.println(y+" is Greater Between The Two Given Numbers");
        else
         System.out.println("Both The Give Numbers are Equal");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Two Number");
        int m = sc.nextInt(),n=sc.nextInt();
        Greater(m, n);
    }
}