//Taking a matrix as input and printing its elements.
import java.util.*;

class InOutMatrix{
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
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}