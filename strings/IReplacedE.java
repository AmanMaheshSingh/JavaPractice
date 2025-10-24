//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. Example : original = “eabcdef’ ; result = “iabcdif”. original = “xyz” ; result = “xyz”
import java.util.*;

class IReplacedE{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine(),result="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='e' || str.charAt(i) == 'E'){
                result+='i';
            }else{
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
    }
}