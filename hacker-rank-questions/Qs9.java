//Write a program to read lines until EOF and print each line with its corresponding line number.
import java.util.*;

class Qs9{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List<String>Lines=new ArrayList<>();
        while(sc.hasNextLine()){
            Lines.add(sc.nextLine());
        }
        for (int i = 0; i < Lines.size(); i++){
            System.out.println((i+1)+" "+Lines.get(i));
        }
    }
}