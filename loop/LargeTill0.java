//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.*;

public class LargeTill0{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Start entering numbers to stop enter 0");
        int max = 0;
        while(true){
            int num = sc.nextInt();
            if(num==0){
                break;
            }
            if(max<num){
                max=num;
            }
        }
        System.out.println("The Largest of all Entered Numbers is "+max);
    }
}