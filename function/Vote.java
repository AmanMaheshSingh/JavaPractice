//Write a function that takes in age as input and returns if that person is eligible to vote or not . A person of age > 18 is eligible to vote
import java.util.*;

class Vote{

    public static void Voting(int age){
        if(age>18)
            System.out.println("You are Eligible");
        else
            System.out.println("You are Not Eligible");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        Voting(age);
    }
}