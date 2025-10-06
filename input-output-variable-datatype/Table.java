//Make a program that prints the table ofa number that is input by the user.
import java.util.*;

class Table{
    public static void main(String[] arg){
        Scanner sc = new Scanner (System.in);
        System.out.printf("Enter a Number:\n");
        int t = sc.nextInt();
        System.out.printf("%d * 1 = %d\n",t,t*1);
        System.out.printf("%d * 2 = %d\n",t,t*2);
        System.out.printf("%d * 3 = %d\n",t,t*3);
        System.out.printf("%d * 4 = %d\n",t,t*4);
        System.out.printf("%d * 5 = %d\n",t,t*5);
        System.out.printf("%d * 6 = %d\n",t,t*6);
        System.out.printf("%d * 7 = %d\n",t,t*7);
        System.out.printf("%d * 8 = %d\n",t,t*8);
        System.out.printf("%d * 9 = %d\n",t,t*9);
        System.out.printf("%d * 10 = %d\n",t,t*10);
    }
}