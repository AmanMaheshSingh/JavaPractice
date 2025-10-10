//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;

class Circumference{

    public static void Circumference(double r) {
        final double pi = 3.14;
        double circumference=2*pi*r;
        System.out.println("The Circumference of a Circle with Radius "+r+" is "+circumference);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius Of The Circle");
        double r = sc.nextDouble();
        Circumference(r);
    }
}