//Compound Interest Java Program
import java.util.*;

public class CompundInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Following :-\n1.Principal Amount\n2.Annual Interest Rate\n3.Amount of time Intrest is Compounded\n4.Time in Years");
        double P=sc.nextDouble(),I=sc.nextDouble(),N=sc.nextDouble(),T=sc.nextDouble();
        double in=1+(I/N),nt=N*T,pow=Math.pow(in, nt),A=P*pow,CI=A-P;
        System.out.println("Compound Intrest With Given Information is : "+CI);
    }
}