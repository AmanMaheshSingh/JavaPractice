//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;

public class SimpleIntrest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Following:-\n1.Principal Amount\n2.Rate Of Intrest(Per Year)\n3.Time(In Years)");
        int P = sc.nextInt(),R = sc.nextInt(),T=sc.nextInt();
        float SI= (P*R*T)/100;
        System.out.println("Simple Intrest = "+SI);
    }
}