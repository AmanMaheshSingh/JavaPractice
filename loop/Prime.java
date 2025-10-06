//Print if a number is prime or not (input n from user).
import java.util.*;

class Prime{
    public static void main (String[] arg){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Number to Check");
        int n = sc.nextInt(),Notprime=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                Notprime++;
                break;
            }
        }
        if(Notprime==0){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime ");
        }
    }
}