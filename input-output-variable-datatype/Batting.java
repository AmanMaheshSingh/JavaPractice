//Calculate Batting Average
import java.util.*;

public class Batting{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Runs Scored By The Player and Number of times he have been dismised");
        int runs= sc.nextInt(),dis= sc.nextInt();
        double avg = runs/dis;
        System.out.println("Batting Average of Current Player is : "+avg);
    }
}