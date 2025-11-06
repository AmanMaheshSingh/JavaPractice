
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
    public static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int sumOfDivisors = 1;
        for (int i = 2; i * i <= num; i++) { 
            if (num % i == 0) {
                sumOfDivisors += i;
                if (i * i != num) { 
                    sumOfDivisors += num / i;
                }
            }
        }

        return sumOfDivisors == num;
    }
}