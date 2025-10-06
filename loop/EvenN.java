//Print all even numbers till n.
import java.util.*;

class EvenN{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}