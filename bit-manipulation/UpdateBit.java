//Update the 2nd Bit (Position = 1) of a number n to 1 or 0 According to The User .(n=0101).
import java.util.*;

class UpdateBit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5; //0101
        int pos = 1;
        int mask = 1 << pos;
        System.out.println("What to Convert in 1 or 0");
        int up = sc.nextInt();
        if(up == 0){
            int clear = (~mask)&n;
            System.out.println(clear);
        }else{
            int set = mask | n;
            System.out.println(set);
        }
    }
}