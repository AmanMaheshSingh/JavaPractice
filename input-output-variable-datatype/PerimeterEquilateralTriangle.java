//Perimeter Of Equilateral Triangle
import java.util.*;

public class PerimeterEquilateralTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side Of Equilateral Triangle");
        float a = sc.nextFloat();
        float Perimeter=3*a;
        System.out.println("The Perimeter Of Equilateral Triangle with Given Side : "+a+" is = "+Perimeter);
    }
}