//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.*;

public class Calc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int num1 = sc.nextInt(),num2 = sc.nextInt();
        System.out.println("Enter The Operand");
        String opperand = sc.next();
        if(opperand.equals("+"))
        System.out.println((num1+num2));
        else if(opperand.equals("-"))
        System.out.println((num1-num2));
        else if(opperand.equals("*"))
        System.out.println((num1*num2));
        else if(opperand.equals("/"))
        System.out.println((num1/num2));
        else if(opperand.equals("%"))
        System.out.println((num1%num2));
        else
        System.out.println("Enter Correct Operand(+,-,*,/,%)");
    }
}