//Calculate Depreciation of Value
import java.util.*;

public class Depreciation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Following\n1.Asset Costing\n2.Asset Salvage Value\n3.Asset Useful Life");
        double c=sc.nextDouble(),sv=sc.nextDouble(),ul=sc.nextDouble();
        double dep=(c-sv)/ul;
        System.out.println("The Depreciation Value of Current Asset is : "+dep+" per year");
    }
}