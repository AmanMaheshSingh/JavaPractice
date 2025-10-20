//Take an array of names as input from the user and print them on the screen 
import java.util.*;

class Name{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Names You Want To Put");
        int size = sc.nextInt();
        String Names[] = new String[size];
        for (int i = 0; i < size; i++) {
            Names[i]=sc.nextLine();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Names[i]);
        }
    }
}