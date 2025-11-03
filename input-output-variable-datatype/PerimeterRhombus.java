//Perimeter Of Rhombus
import java.util.*;

public class PerimeterRhombus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side Of Rhombus");
        float a = sc.nextFloat();
        float Perimeter=4*a;
        System.out.println("The Perimeter Of Rhombus with Given Sides : "+a+" is = "+Perimeter);
    }
}