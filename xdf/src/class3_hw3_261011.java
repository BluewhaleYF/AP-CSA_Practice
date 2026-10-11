//determine how many numbers from 1327 to 4542 that are multiples of 3 but not multiples of 5.
public class class3_hw3_261011 {
    public static void main(String[] args){
        int i;
        int count = 0;

        for ( i = 1327 ; i <= 4542 ; i++ ){
            if ( i % 3 == 0 ){
                if ( i % 5 != 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
