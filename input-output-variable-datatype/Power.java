//Power In Java
import java.util.*;

public class Power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number You Want To know Power for and Enter Power");
        int n = sc.nextInt(),p=sc.nextInt();
        double Power = Math.pow(n, p);
        System.out.println("The Power With Given Inputs is : "+Power);
    }
}