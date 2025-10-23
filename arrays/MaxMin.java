//Find the maximum & minimum number in an array of integers.
import java.util.*;

class MaxMin{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter How Many Number you Want To Enter");
        int size = sc.nextInt();
        int num[] = new int [size];
        for(int i = 0;i < size ;i++){
            num[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(num[i]<min){
                min=num[i];
            }
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("The Maximum Number is : "+max);
        System.out.println("The Minimum Number is : "+min);
    }
}