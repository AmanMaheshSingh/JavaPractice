//Make a menu driven program. The user can enter 2 numbers either 1 or 0. If user enters 1 then keep talking input from user 
//for a students marks (out of 100) if they enter 0 then stop. if he/she scores :
//Marks >= 90 -> print "this is Good" , 89 >= Marks >= 60 ->  print "This is also Good" ,59 >= Marks >= 0 print "This is Good as well"
import java.util.*;

class MenuDriven{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n,marks;
        do{
            System.out.println("Enter Marks of Student Out of 100");
            marks = sc.nextInt();
            if(marks >= 90 && marks <= 100){
                System.out.println("This is Good");
            }else if(marks <= 89 && marks >= 60){
                System.out.println("This is also Good");
            }else if(marks <= 59 && marks >= 0){
                System.out.println("This is Good as Well");
            }else{
                System.out.println("What part of 'Out of 100' you didnt understand? Dumbass");
            }
            System.out.println("Enter 1 to restart and 0 to exit");
            n = sc.nextInt();
        }while( n == 1);
    }
}