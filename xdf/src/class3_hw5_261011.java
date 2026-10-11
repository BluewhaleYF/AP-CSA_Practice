import java.util.Scanner;

//Given an integer num and an integer n, extract the n-th digit of num counting from the right.
public class class3_hw5_261011 {
    public static void main(String[] args){

        //Get user input num and n
        Scanner user = new Scanner(System.in);
        System.out.println("Please give an integer num:");
        int num = user.nextInt();
        System.out.println("Please give an integer n:");
        int n = user.nextInt();
        while ( n < 1 ){
            System.out.println("Invalid input!");
            System.out.println("Please give an integer n:");
            n = user.nextInt();
        }

        //Extract
        int digit = num / (int)Math.pow(10, n - 1) % 10;

        //Output
        System.out.println(digit);
    }
}
