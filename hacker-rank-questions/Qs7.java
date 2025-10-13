//Generate and print a series for each query where each term is calculated as a + (2^0 * b) + (2^1 * b) + … + (2^i * b) for n terms.
import java.util.*;

class Qs7 {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int result = a;
            for (int j = 0; j < n; j++) {
                result += (int) (Math.pow(2, j) * b);
                System.out.print(result + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
