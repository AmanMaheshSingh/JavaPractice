//Perimeter Of Parallelogram
import java.util.*;

public class PerimeterParallelogram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height and Base Of Parallelogram");
        float h = sc.nextFloat(),b=sc.nextInt();
        float Perimeter=2*(h+b);
        System.out.println("The Perimeter Of Triangle with Given Parallelogram : "+h+" and Base : "+b+" is = "+Perimeter);
    }
}