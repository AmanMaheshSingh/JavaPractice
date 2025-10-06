//Print the table of a number input by the user
import java.util.*;

class TableUser{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",n,i,(n*i));
        }
    }
}