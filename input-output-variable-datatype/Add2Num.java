//Addition Of Two Numbers
import java.util.*;

public class Add2Num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number to Add");
        int num1= sc.nextInt(),num2=sc.nextInt(),add=num1+num2;
        System.out.println("The Addition of Two Number is "+add);
    }
}