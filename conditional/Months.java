//Ask the user to Enter the Number of the Month & print the name of the nonth . for eg - For '1' January , '2' Feburary and so on.
import java.util.*;

class Months{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Month\n");
        int num = sc.nextInt();
        switch (num) {
            case 1-> System.out.print("January\n");
            case 2-> System.out.print("Feburary\n");
            case 3-> System.out.print("March\n");
            case 4-> System.out.print("April\n");
            case 5-> System.out.print("May\n");
            case 6-> System.out.print("June\n");
            case 7-> System.out.print("July\n");
            case 8-> System.out.print("August\n");
            case 9-> System.out.print("September\n");
            case 10-> System.out.print("October\n");
            case 11-> System.out.print("November\n");
            case 12-> System.out.print("December\n");
            default -> System.out.print("Error!! Type Within 1-12\n");
        }
    }
}