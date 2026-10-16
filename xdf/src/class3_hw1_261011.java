import java.util.Scanner;

public class class3_hw1_261011 {
    public static void main(String[] args) {

        //Solve the quadratic equation ax^2+bx+c=0


        //Get user input a b c
        Scanner user = new Scanner(System.in);

        System.out.println("Please input the value of a:");
        double a = user.nextDouble();
        if ( a == 0 ){
            System.out.println("This is not a quadratic equation, please check your input.");
            while(true){
                System.out.println("Please input the value of a:");
                double n = user.nextDouble();
                if ( n != 0 ){
                    a = n;
                    break;
                }
            }
        }
        System.out.println("Please input the value of b:");
        double b = user.nextDouble();
        System.out.println("Please input the value of c:");
        double c = user.nextDouble();

        //Check b^2-4ac
        double delta = b * b - 4 * a * c;
        if ( delta < 0 ){

            //If there are no real roots
            System.out.println("This quadratic equation has no real roots!");

        } else if ( delta == 0 ){

            //If there are two identical roots
            double x;
            x = ( -b + Math.sqrt( b * b - 4 * a * c)) / ( 2 * a );

            //Output the result
            System.out.println("x1=x2="+x);

        } else {

            //Calculate the roots
            double x1, x2;
            x1 = ( -b + Math.sqrt( b * b - 4 * a * c)) / ( 2 * a );
            x2 = ( -b - Math.sqrt( b * b - 4 * a * c)) / ( 2 * a );

            //Output the results
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
    }
}
