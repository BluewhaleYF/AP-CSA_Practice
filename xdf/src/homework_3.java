import java.util.Scanner;

public class homework_3 {
    public static void main(String[] args) {

        //Receive two integers input by the user
        Scanner user= new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int a = user.nextInt();
        System.out.println("Please enter the second number:");
        int b = user.nextInt();

        //Swap the values stored in these two variables
        int swap = 0;
        swap = a;
        a = b;
        b = swap;

        //Finally output the two swapped numbers.
        System.out.print(a);
        System.out.print(b);
    }
}
