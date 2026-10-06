public class class2 {
    public static void main(String[] args) {

        /*
        for ( i = 0 ; i <= 100 ; i += 2){
            System.out.println(i);
        }

        for ( i = 7 ; i <= 100 ; i += 7 ){
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i <= 100; i++ ) {
            sum = sum + i;
        }
        System.out.println(sum);

        int s = 0;
        for ( int i = 1; i <= 100; i++ ) {
            s = s + i;
        }
        System.out.println(s);


        //Get an integer from user-input.
        Scanner user= new Scanner(System.in);
        System.out.println("Please enter a number:");
        int i = user.nextInt();
        int a;

        for ( a = 2 ; a < i ; a++ ){
            if ( i % a == 0 ){
                System.out.println(a);
            }
        }

        for ( int i = 1 ; i <= 3 ; i++ ){
            for ( int j = 1 ; j <= 5 ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        for ( int j = 0 ; j < 10 ; j++ ){
            for ( int k = 10 ; k > j ; k-- ){
                System.out.print("*");
            }
            System.out.println();
        }

         */

        for (int i = 5 ; i >= 1 ; i-- ){
            for (int j = i ; j >= 1 ; j-- ) {
                System.out.print(2 * j - 1);
            }
            System.out.println();
        }

    }
}
