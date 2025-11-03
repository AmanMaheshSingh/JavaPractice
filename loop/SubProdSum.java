//Subtract the Product and Sum of Digits of an Integer
import java.util.*;

public class SubProdSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Inteager");
        int num = sc.nextInt();
        int sum=0,prod=1;
        int l = String.valueOf(num).length();
        for(int i = 1;i<=l;i++){
            int t = num%10;
            sum+=t;
            prod*=t;
            num=num/10;
        }
        int sub = prod - sum;
        System.out.println(sub);
    }
}