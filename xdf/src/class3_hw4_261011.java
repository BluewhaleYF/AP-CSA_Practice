import java.util.Scanner;

//Given a four-digit number, extract each digit of the number.
public class class3_hw4_261011 {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        System.out.println("Please give a four-digit number");
        int n = user.nextInt();
        while ( n > 9999 || n < 1000 ){
            System.out.println("Please give a four-digit number");
            int m = user.nextInt();
            if ( m <= 9999 && m >= 1000 ){
                n = m;
                break;
            }
        }

        //Extract
        int a = 0,b = 0,c = 0,d = 0;
        a = n / 1000;
        b = n / 100 % 10;
        c = n / 10 % 10;
        d = n % 10;

        //Output
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
