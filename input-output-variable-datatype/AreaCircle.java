//Area Of Circle Java Program
import java.util.*;

public class AreaCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle");
        float r = sc.nextFloat();
        float pi=3.14f;
        float Area=pi*r*r;
        System.out.println("The Area Of Circle with Given Radius : "+r+" is = "+Area);
    }
}