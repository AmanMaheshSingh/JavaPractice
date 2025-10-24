//Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.
import java.util.*;

class BinaryDecimal{
    public static String decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            binary.append(remainder);
            n = n / 2;
        }
        return binary.reverse().toString(); 
    }

    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int power = 0;
        while (binary > 0) {
            int lastDigit = binary % 10; 
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary = binary / 10; 
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        System.out.println("Binary of " + decimal + " = " + decimalToBinary(decimal));
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();
        System.out.println("Decimal of " + binary + " = " + binaryToDecimal(binary));
    }
}