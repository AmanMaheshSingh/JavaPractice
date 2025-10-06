/*Print The Pattern 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/
class HalfPyramidNumber{
    public static void main(String[] args){
        int m=5;
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=i;j++){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
}