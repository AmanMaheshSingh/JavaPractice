//Volume Of Prism
import java.util.*;

public class VolumePrism{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base and Height of Prism");
        float b = sc.nextFloat(),h=sc.nextFloat();
        float Volume = b*h;
        System.out.println("The Volume of Prism with Given Base : "+b+" and Height : "+h+" is = "+Volume);
    }
}