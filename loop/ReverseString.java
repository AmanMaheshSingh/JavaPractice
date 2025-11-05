//Reverse A String In Java
import java.util.*;

public class ReverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The String");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        sb.reverse();
        System.out.println("Reverse String : "+sb);
    }
}