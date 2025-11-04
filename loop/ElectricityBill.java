//Calculate Electricity Bill
import java.util.*;

public class ElectricityBill{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter :-\n1.Current Reading \n2.Previous Reading \nBoth in kWh");
        int cr=sc.nextInt(),pr=sc.nextInt();
        int tr=cr-pr;
        System.out.println("Enter Traffic Rate Per kWh");
        double traf=sc.nextDouble();
        double ec=tr*traf;
        System.out.println(ec+" is Your Electricity Bill Withoout GST");
    }
}