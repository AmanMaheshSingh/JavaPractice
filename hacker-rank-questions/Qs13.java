//
import java.util.*;
import java.text.*;

public class Qs13 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat usF = NumberFormat.getCurrencyInstance(Locale.US);
        Locale indiaLocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        NumberFormat indiaG = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat chinaF = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceF = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = usF.format(payment);
        String india = indiaG.format(payment);
        String china = chinaF.format(payment);
        String france = franceF.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}