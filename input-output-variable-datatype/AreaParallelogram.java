//Area Of Parallelogram
import java.util.*;

public class AreaParallelogram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height and Base Of Parallelogram");
        float h = sc.nextFloat(),b=sc.nextInt();
        float Area=h*b;
        System.out.println("The Area Of Triangle with Given Parallelogram : "+h+" and Base : "+b+" is = "+Area);
    }
}