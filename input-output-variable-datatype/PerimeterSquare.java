//Perimeter Of Square
import java.util.*;

public class PerimeterSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side Of Square");
        float a = sc.nextFloat();
        float Perimeter=4*a;
        System.out.println("The Perimeter Of Square with Given Sides : "+a+" is = "+Perimeter);
    }
}