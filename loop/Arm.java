//Armstrong Number In Java
import java.util.*;

public class Arm{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number To Check");
        int n = sc.nextInt(),t=n;
        int length = String.valueOf(n).length(),arm=0;
        for(int i = 1;i<=length;i++){
            arm+=Math.pow((n%10),length);
            n=n/10;
        }
        if(arm==t){
            System.out.println("Given Number is Armstrong Number");
        }else{
            System.out.println("Given Number is Not a Armstrong Number");
        }
    }
}