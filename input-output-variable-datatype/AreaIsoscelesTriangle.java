//Area Of Isosceles Triangle
import java.util.*;

public class AreaIsoscelesTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height and Base Of Triangle");
        float h = sc.nextFloat(),b=sc.nextInt();
        float Area=(h*b)/2;
        System.out.println("The Area Of Isosceles Triangle with Given Height : "+h+" and Base : "+b+" is = "+Area);
    }
}