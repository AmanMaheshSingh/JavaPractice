//Curved Surface Area Of Cylinder
import java.util.*;

public class CSACylinder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius and Height of Cylinder");
        float r = sc.nextFloat(),h=sc.nextFloat(),pi=3.14f;
        float CSA = 2*pi*r*h;
        System.out.println("The Curved Surface Area of Cylinder with Given Radius : "+r+" and Height : "+h+" is = "+CSA);
    }
}