//Compound Interest Java Program
import java.util.*;

public class AverageMarks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Subjects you Have");
        int sub=sc.nextInt();
        System.out.println("Start Entering Their Marks in the End Enter -1");
        int n,sum=0;
        while(true){
            n = sc.nextInt();
            if (n==-1){
                break;
            }
            sum+=n;
        }
        double avg = sum/sub;
        System.out.println("You Average Marks is : "+avg);
    }
}