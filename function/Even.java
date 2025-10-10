//Make a function to check if a given number is even or not 
import java.util.*;

class Even{
    public static void Even(int n ) {
        if(n%2==0){
            System.out.println(n+" is Even");
        }else{
            System.out.println(n+" is Not Even");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Be Checked");
        int n = sc.nextInt();
        Even(n); 
    }
}