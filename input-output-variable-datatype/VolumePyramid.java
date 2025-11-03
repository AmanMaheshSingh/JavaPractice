//Volume Of Pyramid
import java.util.*;

public class VolumePyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length, Width and Height of Cylinder");
        float l = sc.nextFloat(),w=sc.nextFloat(),h=sc.nextFloat();
        float Volume = (l*w*h) /3;
        System.out.println("The Volume of Pyramid with Given Length : "+l+" , Width : "+w+" and Height : "+h+" is = "+Volume);
    }
}