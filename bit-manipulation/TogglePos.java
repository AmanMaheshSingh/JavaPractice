//Write a program to toggle a bit a position = “pos” in a number “n”.
import java.util.*;

class TogglePos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the position to toggle (pos): ");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;   
        int newNumber = n ^ bitMask;  
        System.out.println("Number after toggling bit at position " + pos + " : " + newNumber);
    }
}