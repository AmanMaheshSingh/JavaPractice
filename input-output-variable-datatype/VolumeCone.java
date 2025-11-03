//Volume Of Cone Java Program
import java.util.*;

public class VolumeCone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius and Height of Cone");
        float r = sc.nextFloat(),h=sc.nextFloat(),pi=3.14f;
        float Volume = (pi*r*r)*(h/3);
        System.out.println("The Volume of Cone with Given Radius : "+r+" and Height : "+h+" is = "+Volume);
    }
}