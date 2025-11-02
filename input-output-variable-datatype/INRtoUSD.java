//Input currency in rupees and output in USD.
import java.util.*;

public class INRtoUSD{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Money in INR");
        float inr = sc.nextFloat(),usd = inr/88.79f;
        System.out.println("INR "+inr+" = USD "+usd);
    }
}