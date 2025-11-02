//Area Of Triangle
import java.util.*;

public class AreaTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height and Base Of Triangle");
        float h = sc.nextFloat(),b=sc.nextInt();
        float Area=0.5f*h*b;
        System.out.println("The Area Of Triangle with Given Height : "+h+" and Base : "+b+" is = "+Area);
    }
}