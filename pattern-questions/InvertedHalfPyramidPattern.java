 /*Print The Following Pattern 
 1 1 1 1
 2 2 2 
 3 3 
 4
 */
class InvertedHalfPyramidPattern{
    public static void main(String[] args) {
        int m = 5;
        for(int i = 1;i<=m;i++){
            for(int j = 1; j<=m-i+1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}