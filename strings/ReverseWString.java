//Write a Java program to reverse the order of words in a given sentence.
// Example:
// Input → "Java is fun"
// Output → "fun is Java"

import java.util.*;

class ReverseWString{
    public static String Reverse(String S) {
        String Reversed="";
        String[] line = S.split(" ");
        for (int i = line.length-1; i >= 0; i--) {
            Reversed += line[i];
            if(i>0)
            Reversed += " ";
        }
        return Reversed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String r = Reverse(s);
        System.out.println(r);
    }
}