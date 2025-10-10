//Print My Name Using Functions
import java.util.*;

class printMyName{
    public static void printMyName(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        printMyName(name);
    }
}