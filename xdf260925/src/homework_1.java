import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args) {
        //Get an integer from user-input.
        Scanner user= new Scanner(System.in);
        System.out.println("Please enter a number:");
        int a = user.nextInt();
        //Decide if the integer is positive or non-positive.
        if ( a > 0 ){
            //Print “Positive!” if integer is positive
            System.out.println("Positive!");
        }
        else if( a < 0 ){
            //Print “Negative!” if integer is negative
            System.out.println("Negative!");
        }
        else if ( a == 0 ){
            //Print “Zero!” if integer is zero
            System.out.println("Zero!");
        }
        else{
            //Print “End!” when done.
            System.out.println("End!");
        }
    }
}
