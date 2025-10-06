/*Print The Pattern
* * * * * 
*       * 
*       * 
* * * * * 
*/


// class PrintStarPattern2{
//     public static void main(String[] args) {
//         for(int i = 1;i<=4;i++){
//             for(int j = 1;j<=5;j++){
//                 if(j>1 && i>1 && i<4 && j<5 && i>1 && i<4){
//                     System.out.print("  ");
//                 }else{
//                     System.out.print("* ");
//                 }
//             }
//             System.out.println();
//         }    
//     }
// }


class PrintStarPattern2{
    public static void main(String[] args) {
        int m = 4,n = 5;
        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=5;j++){
                if(i==1||j==1||i==m||j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }    
    }
}