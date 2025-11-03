//Perimeter Of Rectangle
import java.util.*;

public class PerimeterRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length and Width Of Rectangle");
        float l = sc.nextFloat(),w=sc.nextInt();
        float Perimeter=2*(l+w);
        System.out.println("The Perimeter Of Triangle with Given Length : "+l+" and Base : "+w+" is = "+Perimeter);
    }
}