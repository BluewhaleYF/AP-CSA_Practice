import java.util.Scanner;

public class class3_20261007 {
    public static void main(String[] args){

        double y = Math.pow(3,2);
        double z = Math.sqrt(256);
        System.out.println(y);
        System.out.println(z);

        //计算直角三角形斜边长
        //Step1：获取a,b两边值
        Scanner user= new Scanner(System.in);

        double a;
        while (true) {
            System.out.println("Please enter the lenth of a:");
            a = user.nextDouble();
            if ( a <= 0 ){
                System.out.println("Invalid value!");
                continue;
            }
            break;
        }

        double b;
        while (true) {
            System.out.println("Please enter the lenth of b:");
            b = user.nextDouble();
            if ( b <= 0 ){
                System.out.println("Invalid value!");
                continue;
            }
            break;
        }

        //Step2：计算
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(c);

        double m = Math.random();
        double n = Math.abs(-23);

        while(true) {
            int y = (int) (Math.random() * 100) + 1;
            if ( y >= 2 && y <= 51 ) {
                System.out.println(y);
                break;
            }
        }
        while(true) {
            int x = (int) (Math.random() * 17) + 17;
            System.out.println(x);
        }

        //Generate number
        int number = (int) (Math.random() * 10) + 1;
        System.out.println(number);

        //Get user input
        int user;
        while(true) {
            System.out.println("Please enter a number between 1 and 10:");
            Scanner in = new Scanner(System.in);
            user = in.nextInt();
            if ( user >= 1 && user <= 10 ) {
                break;
            }
        }
        while(true) {
            System.out.println("Try again:");
            Scanner in2 = new Scanner(System.in);

            if (user == number) {
                System.out.println("You win!");
            } else if (user < number) {
                System.out.println("Too small!");
            } else if (user > number) {
                System.out.println("Too big!");
                break;
            }

        int n;
        int cal;
        int sum = 0;

        System.out.println("Please enter a number");
        Scanner in = new Scanner(System.in);
        n =  in.nextInt();

        for ( cal = 1 ; cal <= n ; cal++ ){
            sum += cal;
        }
        System.out.println(sum);
        System.out.println((double)sum/n);
    }
}
