import java.util.Scanner;

public class homework_2 {
    public static void main(String[] args) {

        //Get two integers TOEFL, SAT from user-input.
        Scanner user= new Scanner(System.in);
        System.out.println("Your TOEFL grade?");
        int toefl = user.nextInt();
        System.out.println("Your SAT grade?");
        int sat = user.nextInt();

        //If TOEFL >= 100 and SAT >= 1500, print “Good”;
        if ( toefl >= 100 && sat >= 1500 ){
            System.out.println("Good");
        }
        //if only one of the above is true, print “Fair”;
        else if ( toefl >= 100 || sat >= 1500 ){
            System.out.println("Fair");
        }
        //if neither of the above is true, print “Bad”;
        else if ( toefl <= 100 && sat <= 1500 ){
            System.out.println("Bad");
        }
        System.out.println("End");
    }
}
