//Calculate Distance Between Two Points
import java.util.*;

public class DistanceTwoPoints{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter x & y Coordinates of Point 1");
        double x1 = sc.nextDouble(),y1 = sc.nextDouble();
        System.out.println("Enter x & y Coordinates of Point 2");
        double x2 = sc.nextDouble(),y2 = sc.nextDouble();
        double X = x2-x1,Y = y2-y1;
        double squaredX = Math.pow(X, 2),squaredY=Math.pow(Y, 2);
        double addSquares=squaredX+squaredY;
        double distance = Math.sqrt(addSquares);
        System.out.println("Distance Between Two Given Points is : "+distance);
    }
}