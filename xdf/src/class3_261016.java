import java.util.Scanner;

public class class3_261016 {
    public static void main(String[] args){
        /*
        //费波纳契数列
        Scanner user = new Scanner(System.in);
        System.out.println("Please give an integer num:");
        int max = user.nextInt();
        max = max - 2;

        int a = 0;
        int b = 1;
        int c = 0;
        int num = 0;

        System.out.println(a);
        System.out.println(b);

        int i;
        for (i = 0 ; i < max ; i++ ){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }


        //质数检测器
        int n;
        Scanner user = new Scanner(System.in);
        n = user.nextInt();
        int i,count = 0;
        for ( i = 2 ; i < Math.sqrt(n) ; i++){
            if ( n % i == 0 ) {
                count++;
            }
        }
        if ( count == 0 ){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
         */

        //阶乘
        int n = 5;
        int sum = 0;
        int i;

        for ( i = 1 ; i <= n ; i++ ){
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
