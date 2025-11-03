//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.*;

public class SumTill0{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Start entering numbers to stop enter 0");
        int sum = 0;
        while(true){
            int num = sc.nextInt();
            if(num==0){
                break;
            }
            sum+=num;
        }
        System.out.println("The Sum of all Entered Numbers is "+sum);
    }
}