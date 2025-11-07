//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.*;

public class NegPosOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Start entering numbers to stop enter 0");
        int pos = 0,neg=0,odd_pos=0;
        while(true){
            int num = sc.nextInt();
            if(num==0){
                break;
            }
            if(num<0){
                neg++;
            }
            if(num>0){
                pos++;
            }
            if(num>0 & num%2!=0){
                odd_pos++;
            }
        }
        System.out.println("Negative Numbers Entered : "+neg+"\nPositive Numbers Entered : "+pos+"\nOdd Positive Number Entered : "+odd_pos);
    }
}