//Print the spiral order matrix as output for a given matrix of numbers. 
import java.util.*;

class SprialMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows And Number of Columns");
        int n = sc.nextInt(),m= sc.nextInt();
        int [] [] matrix = new int[n] [m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix [i] [j]=sc.nextInt();
            }
        }
        int row_start=0,row_end=n-1,column_start=0,column_end=m-1;
        System.out.print("Spiral Order : ");
        while(row_start<=row_end && column_start<=column_end){
            for(int i = column_start;i<=column_end;i++){
                System.out.print(matrix[row_start][i]+" ");
            }
            row_start++;
            for(int i = row_start;i<=row_end;i++){
                System.out.print(matrix[i][column_end]+" ");
            }
            column_end--;
            for(int i = column_end;i>=column_start;i--){
                System.out.print(matrix[row_end][i]+" ");
            }
            row_end--;
            for(int i = row_end;i>=row_start;i--){
                System.out.print(matrix[i][column_start]+" ");
            }
            column_start++;
        }
    }
}