//Total Surface Area Of Cube
import java.util.*;

public class TSACube{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side Of Cube");
        float a = sc.nextFloat();
        float TSA=6*a*a;
        System.out.println("The Total Surface Area Of Cube with Given Side : "+a+" is = "+TSA);
    }
}