//Make a function To Print the Table of a given Number n
import java.util.*;

class Table{
    public static void Table(int n ) {
        for(int i = 1 ; i<=10;i++){
            System.out.printf("%d x %d = %d\n",n,i,i*n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        Table(n); 
    }
}