//Area Of Rhombus
import java.util.*;

public class AreaRhombus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Diagonal-1 and Diagonal-2 Of Rhombus");
        float d1 = sc.nextFloat(),d2=sc.nextInt();
        float Area=(d1*d2)/2;
        System.out.println("The Area Of Rhombus with Given Diagonal-1 : "+d1+" and Diagonal-2 : "+d2+" is = "+Area);
    }
}