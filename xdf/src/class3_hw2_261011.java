///Let the user enter a start number and an end number. Calculate the sum of squares of all even integers between the start number and the end number.

import java.util.Scanner;

public class class3_hw2_261011 {
    public static void main(String[] args) {

        //Get the start number and the end number
        Scanner user = new Scanner(System.in);
        System.out.println("Please give out the start number:");
        int a = user.nextInt();
        System.out.println("Please give out the end number:");
        int b = user.nextInt();
        while( a > b ){
            System.out.println("Invalid input!");
            System.out.println("Please give out the start number:");
            int c = user.nextInt();
            System.out.println("Please give out the end number:");
            int d = user.nextInt();
            if ( c <= d ){
                    a = c;
                    b = d;
                    break;
            } else {
                System.out.println("Please check your input again.");
            }
        }

        long sum = 0;
        int i = a;
        if ( i % 2 != 0 ){
            i++;
        }
        for ( ; i <= b ; i+= 2 ){
            sum += (long)i*i;
        }
        System.out.println(sum);
    }
}
