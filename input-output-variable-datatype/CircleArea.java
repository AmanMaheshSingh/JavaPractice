//make a program that takes the radius of a circle as input ,caslculate its area and print it as output to the user.
import java.util.*;

class CircleArea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle:\n");
        double r = sc.nextFloat(),area=3.14*r*r;
        System.out.printf("The Area of Circle with given Radius %.2f is %.2f.\n",r,area);
    }
}