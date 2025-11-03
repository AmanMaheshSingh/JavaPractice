//Volume Of Sphere
import java.util.*;

public class VolumeSphere{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Sphere");
        float r = sc.nextFloat(),pi=3.14f;
        float Volume = (4/3)*pi*r*r*r;
        System.out.println("The Volume of Sphere with Given Radius : "+r+" is = "+Volume);
    }
}