//HCF Of Two Numbers Program
import java.util.*;

public class HCF{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Two Numbers");
        int num1=sc.nextInt(),num2=sc.nextInt(),limit =(num1<=num2)?num1:num2,max=0;
        for (int i = 1; i <= limit; i++) {
            if(num1%i==0&&num2%i==0){
                max=i;
            }
        }
        System.out.println("HCF for Given Numbers is : "+max);
    }
}