//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.*;

class CumulativeSB{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);   
        System.out.println("Enter How Many Strings You Want to Enter");
        int size = sc.nextInt(),length=0;
        sc.nextLine();
        StringBuilder [] str = new StringBuilder[size];
        for (int i = 0; i < size; i++) {
            str[i]=new StringBuilder(sc.nextLine());
            length+=str[i].length();
        }
        System.out.println(length);
    }
}