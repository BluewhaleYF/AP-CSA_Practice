import java.util.Scanner;
// finally output the two swapped numbers.
// (For example, if the user enters 3 and 4, the output should be 4 and 3.)
public class homework_3 {
    public static void main(String[] args) {

        //Receive two integers input by the user
        Scanner user= new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int a = user.nextInt();
        System.out.println("Please enter the second number:");
        int b = user.nextInt();

        // swap the values stored in these two variables
        int swap = 0;
        swap = a;
        a = b;
        b = swap;

        System.out.print(a);
        System.out.print(b);
    }
}
