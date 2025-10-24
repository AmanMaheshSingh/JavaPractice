//For a given matrix of N x M, print its transpose.
import java.util.*;

class TransposeMatrix{
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
        System.out.println("The Transpose of The Give Matrix is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}