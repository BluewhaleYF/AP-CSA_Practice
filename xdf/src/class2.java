public class class2 {
    public static void main(String[] args) {

        /*
        for ( i = 0 ; i <= 100 ; i += 2){
            System.out.println(i);
        }

        for ( i = 7 ; i <= 100 ; i += 7 ){
            System.out.println(i);
        }
        */
        int sum = 0;
        for (int i = 1; i <= 100; i++ ) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
