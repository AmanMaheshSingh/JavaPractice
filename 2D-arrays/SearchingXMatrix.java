//Searching for an element x in a matrix.
import java.util.*;

class SearchingXMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows And Number of Columns");
        int rows = sc.nextInt(),cols= sc.nextInt();
        int [] [] matrix = new int[rows] [cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix [i] [j]=sc.nextInt();
            }
        }
        System.out.println("Enter Row and Column Number of Element X");
        int r = sc.nextInt(),c=sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(i+1==r && j+1 == c){
                    System.out.println("Element x is : " + matrix[i][j]);
                    break;
                }
            }
        }
    }
}