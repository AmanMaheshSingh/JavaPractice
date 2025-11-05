//Find Ncr & Npr
import java.util.*;

public class NcrNpr{
    public static int fact(int n) {
        int fact=1;
        if(n>0){
            for(int i = n ;i>=2;i--){
                fact*=i;
            }
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Value of n and r");
        int n = sc.nextInt(),r=sc.nextInt();
        int factN=fact(n),factR=fact(r),factNR=fact(n-r);
        double nPr=factN/factNR,nCr=factN/(factR*factNR);
        System.out.println("nPr is : "+nPr+"\n"+"nCr is : "+nCr);
    }
}