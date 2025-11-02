//Area Of Rectangle Program
import java.util.*;

public class AreaRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length and Width Of Rectangle");
        float l = sc.nextFloat(),w=sc.nextInt();
        float Area=l*w;
        System.out.println("The Area Of Triangle with Given Length : "+l+" and Base : "+w+" is = "+Area);
    }
}