//Given an integer, n , perform the following conditional actions:
//If n is odd, print Weird
//If n is even and in the inclusive range of  to 2 to 5 , print Not Weird
//If n is even and in the inclusive range of  to 6 to 20 , print Weird
//If n is even and greater than 20 , print Not Weird
//Complete the stub code provided in your editor to print whether or not  is weird.
import java.util.*;

class Qs3{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2!=0){
            System.out.println("Weird\n");
        }else if(N%2==0 && N>=2 && N<=5){
            System.out.println("Not Weird\n");
        }else if(N%2==0 && N>=6 && N<=20){
            System.out.println("Weird\n");
        }else if(N%2==0 && N>20){
            System.out.println("Not Weird\n");
        }
        scanner.close();
    }
}