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
        if ( Math.pow(b,2)-4*a*c < 0 ){
            System.out.println("This quadratic equation has no real roots!");
        } else {
            //Calculate the roots
            double x1, x2;
            x1 = (b * -1 + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) * Math.pow(2 * a, -1);
            x2 = (b * -1 - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) * Math.pow(2 * a, -1);

            //Output the result
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
