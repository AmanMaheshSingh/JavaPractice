//Take name as input and print a greeting message for that particular name.
import java.util.*;

public class NameGreating{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Welcome "+name+",\nTo the Java Practice Repo Of Aman Mahesh Singh a Software Developer From India");
    }
}