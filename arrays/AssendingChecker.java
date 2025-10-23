//Take an array of numbers as input and check if it is an array sorted in scending order. Eg : { 1, 2, 4, 7 } is sorted in ascending order. {3, 4, 6, 2} is not sorted in ascending order.
import java.util.*;

class AssendingChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter How Many Number you Want To Enter");
        int size = sc.nextInt();
        int num[] = new int [size];
        for(int i = 0;i < size ;i++){
            num[i] = sc.nextInt();
        }
        boolean assending= true;
        for(int i = 0;i < size - 1 ;i++){
            if(num[i]>num[i+1]){
                assending = false;
                break;
            }
        }
        if(assending){
            System.out.println("This Array is in Assending Order");
        }else{
            System.out.println("This Array is not in Assending Order");
        }
    }
}