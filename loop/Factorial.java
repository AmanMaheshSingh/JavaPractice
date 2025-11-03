//Factorial Program In Java
import java.util.*;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt(),fact=1;
        if(num>0){
            for(int i = num ;i>=2;i--){
                fact*=i;
            }
            System.out.println("The factorial of Given Number "+num+" is : "+fact);
        }else{
            System.out.println("Error! Number Should be Above 0");
        }
    }
}