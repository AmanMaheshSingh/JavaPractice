//To find Armstrong Number between two given number.
import java.util.*;

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Numbers To Check");
        int n1 = sc.nextInt(),n2=sc.nextInt(),t1=n1,t2=n2;
        int length1 = String.valueOf(n1).length(),arm1=0;
        int length2 = String.valueOf(n2).length(),arm2=0;
        for(int i = 1;i<=length1;i++){
            arm1+=Math.pow((n1%10),length1);
            n1=n1/10;
        }
        for(int i = 1;i<=length2;i++){
            arm2+=Math.pow((n2%10),length1);
            n2=n2/10;
        }
        if(t1==arm1 && t2==arm2){
            System.out.println(t1+" "+t2+" Both Are Armstrong Numbers");
        }else if(t1==arm1 && t2!=arm2){
            System.out.println(t1+" Is a Armstrong Number\n"+t2+" Is Not a Armstrong Number");
        }else if(t1!=arm1 && t2==arm2){
            System.out.println(t1+" Is Not a Armstrong Number\n"+t2+" Is a Armstrong Number");
        }else{
            System.out.println(t1+" "+t2+" Both Are Not Armstrong Numbers");
        }
    }
}