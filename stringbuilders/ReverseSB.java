//Reverse a StringBuilder
import java.util.*;

class ReverseSB{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        for (int i =sb.length()-1 ; i >= 0; i--) {
            System.out.print(sb.charAt(i));
        }
        System.out.println();
    }
}