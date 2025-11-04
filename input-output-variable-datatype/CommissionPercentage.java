//Calculate Commission Percentage
import java.util.*;

public class CommissionPercentage{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Commision Amount and Total Sales");
        double ca = sc.nextDouble(),ts=sc.nextDouble(),cp=(ca/ts)*100;
        System.out.println("The Commission Percentage in Current deal is : "+cp+"%");
    }
}