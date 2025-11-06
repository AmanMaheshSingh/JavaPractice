//Future Investment Value
import java.util.*;

public class FutureInvestment{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Present Vale,Rate of Intrest,Number of Period");
        double pv = sc.nextDouble(),r=sc.nextDouble(),n=sc.nextDouble();
        double pow=Math.pow(1+r,n),fv=pv*pow;
        System.out.println("Future Value is : "+fv); 
    }
}