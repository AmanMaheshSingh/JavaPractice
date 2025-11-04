//Calculate Discount Of Product
import java.util.*;

public class Discount{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Original Price and Selling Price");
        double op=sc.nextDouble(),sp=sc.nextDouble(),dis=op-sp;
        System.out.println("The Discount is : "+dis+"rs");
    }
}