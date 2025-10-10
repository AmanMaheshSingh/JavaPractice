//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
import java.util.*;

class PosNegZero{
    public static void countNumbers() {
        Scanner sc = new Scanner(System.in);
        int num;
        int positive = 0, negative = 0, zeros = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();

            if (num > 0)
                positive++;
            else if (num < 0)
                negative++;
            else
                zeros++;

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\n--- Result ---");
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zeros);
    }

    public static void main(String[] args) {
        countNumbers();  
    }
}
