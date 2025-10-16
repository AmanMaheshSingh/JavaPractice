//Make a java program to print the marks of following subject no using arrays
import java.util.*;

class Marks{
    public static void main(String[] args) {
        int[] Marks = {20,16,20,18,17};
        Scanner sc = new Scanner(System.in);
        System.out.print("Subject Codes:-\nC Programing: 0\nPrinciple of Management: 1\nMaths: 2\nComputer Fundamental: 3\nEnglish: 4\nEnter the Subject Code: ");
        int c = sc.nextInt();
        System.out.printf("%d Out of 20\n",Marks[c]);
    }
}