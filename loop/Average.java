//Calculate Average Of N Numbers
import java.util.*;

public class Average{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Start Entering Number to stop Enter 0");
        int n,sum=0,count=0;
        while(true){
            n=sc.nextInt();
            if(n!=0){
                sum+=n;
                count++;
            }else{
                break;
            }
        }
        double avg = sum/count;
        System.out.println("The Average of Entered Number is : "+avg);
    }
}