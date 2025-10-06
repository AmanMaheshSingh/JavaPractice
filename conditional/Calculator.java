//Make a Calculator Take 2 numbers (a&b) from the user and an operation as follow 1: +(Addition) a+b 2.-(Subtraction) a-b 3. *(Multiplication) a*b 4./(Division) a/b Calculate the result according to the operation given and display it to the user.
import java.util.*;

class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Numbers :\n");
        double a = sc.nextDouble(),b = sc.nextDouble();
        System.out.print("Enter the operation to perform\n1.For Addition\n2.For Subtraction\n3.Multiplication\n4.Division\n");
        int opp = sc.nextInt();
        switch(opp){
            case 1 -> System.out.printf("%.2f + %.2f = %.2f\n",a,b,(a+b));
            case 2 -> System.out.printf("%.2f - %.2f = %.2f\n",a,b,(a-b));
            case 3 -> System.out.printf("%.2f * %.2f = %.2f\n",a,b,(a*b));
            case 4 -> System.out.printf("%.2f / %.2f = %.2f\n",a,b,(a/b));
            default -> System.out.print("Error!! Check if Entered everything Correctly\n");
        }
    }
}