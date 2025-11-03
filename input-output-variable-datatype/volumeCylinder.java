//Volume Of Cylinder
import java.util.*;

public class volumeCylinder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius and Height of Cylinder");
        float r = sc.nextFloat(),h=sc.nextFloat(),pi=3.14f;
        float Volume = (pi*r*r) *h;
        System.out.println("The Volume of Cylinder with Given Radius : "+r+" and Height : "+h+" is = "+Volume);
    }
}