//Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user. Example : email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” . email = “helloWorld123@gmail.com”; username = “helloWorld123”
import java.util.*;

class EmailToUsername{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Email Id");
        String str = sc.nextLine(),Username="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='@'){
                break;
            }else{
                Username+=str.charAt(i);
            }
        }
        System.out.println(Username);
    }
}