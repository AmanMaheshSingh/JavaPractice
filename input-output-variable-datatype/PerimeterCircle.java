//Perimeter Of Circle
import java.util.*;

public class PerimeterCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle");
        float r = sc.nextFloat();
        float pi=3.14f;
        float Area=2*pi*r;
        System.out.println("The Area Of Circle with Given Radius : "+r+" is = "+Area);
    }
}