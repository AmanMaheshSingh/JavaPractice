//Make a function to check if a number is prime or not 
import java.util.*;

class Prime{
    public static void Prime(int n ) {
        int nPrime=0;
        for (int i = 2;i<n;i++){
            if(n%i==0){
                nPrime++;
            }
        }
        if(nPrime>0){
            System.out.println(n+" is Not Prime");
        }else{
            System.out.println(n+" is Prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Be Checked");
        int n = sc.nextInt();
        Prime(n); 
    }
}