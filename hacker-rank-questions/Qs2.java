//In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line.
//HackerRank Java Prepare Question no 2
import java.util.*;

class Qs2{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(),b = scan.nextInt(),c = scan.nextInt();

        System.out.printf("%d\n%d\n%d\n",a,b,c);
        
    }
}