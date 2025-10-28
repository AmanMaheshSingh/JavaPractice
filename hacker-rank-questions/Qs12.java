import java.io.*;
import java.util.*;

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",
                         "THURSDAY", "FRIDAY", "SATURDAY"};
        return days[cal.get(Calendar.DAY_OF_WEEK) - 1];
    }
}

public class Qs12 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        System.out.print("Enter year (e.g. 2025): ");
        int year = sc.nextInt();

        String res = Result.findDay(month, day, year);
        System.out.println("The day is: " + res);
    }
}
