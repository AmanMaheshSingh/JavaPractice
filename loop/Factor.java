//Input a number and print all the factors of that number (use loops).
import java.util.*;

public class Factor{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Numbers");
        int n = sc.nextInt(),flag=0;
        for (int i = 2;i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                flag++;
            }
        }
        if(flag==0){
            System.out.println("Your Number is a Prime Number It Dosent Have any Factors");
        }
    }
}