//Enter Three Numbers From The User & make a function to print their average
import java.util.*;

class Avg{

    public static void Average(int x, int y, int z){
        double avg = (x + y + z)/3.0; 
        System.out.println("The Average Of The Three Given Number is "+avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("The Three Integers");
        int a = sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        Average(a,b,c);
    }
}