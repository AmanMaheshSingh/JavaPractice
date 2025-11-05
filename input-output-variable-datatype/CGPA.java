//Calculate CGPA Java Program
import java.util.*;

public class CGPA{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Give me your Total Marks * Total credit of all semester and total credit");
        int m=sc.nextInt(),c=sc.nextInt();
        double cgpa = m/c;
        System.out.println("Your CGPA with Given Information is : "+cgpa);
    }
}