//Check Leap Year Or Not
import java.util.*;

public class Leap{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if(n%4==0){
            System.out.println("Its is a Leap year");
        }else{
            System.out.println("Its not a Leap year");
        }
    }
}