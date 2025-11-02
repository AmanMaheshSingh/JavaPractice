//Take 2 numbers as input and print the largest number.
import java.util.*;

public class Largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Two Numbers");
        int n1 = sc.nextInt(),n2=sc.nextInt();
        if(n1>n2){
        System.out.println(n1+" is Greater than "+n2);
        }else if (n2>n1){
        System.out.println(n2+" is Greater than "+n1);
        }else{
        System.out.println(n2+" is Equal To "+n1);
        }
    }
}