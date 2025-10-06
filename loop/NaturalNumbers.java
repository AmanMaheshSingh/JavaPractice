//Print the Sum of First n Natural Numbers
import java.util.*;

class NaturalNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt(),s=0;
        for(int i = 0;i<=n;i++){
            s+=i;
        }
        System.out.println(s);
    }
}