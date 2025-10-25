//Complete the class using a static initialization block to read breadth and height, and print the area of a parallelogram or an exception if inputs are non-positive.
import java.util.*;

class Qs10{
    static int B;
    static int H;
    static boolean flag = true;
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}