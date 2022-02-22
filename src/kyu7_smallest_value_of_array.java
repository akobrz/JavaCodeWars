import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;

public class kyu7_smallest_value_of_array {

    public static int findSmallest( final int[] numbers, final String toReturn ) {
        if ( toReturn.equals("value")) {
            int min = numbers[0];
            for (int i : numbers)
                if (i < min)
                    min = i;
            return min;
        } else {
            int min = numbers[0];
            int idx = 0;
            for (int i=0; i<numbers.length; i++){
                if (numbers[i]<min){
                    min = numbers[i];
                    idx = i;
                }
            }
            return idx;
        }
    }

    public static void main(String[] args) {
        assertEquals( "The smallest value" , 2 , findSmallest( new int [] {7, 12, 3, 2, 27} , "value") );
        assertEquals("The smallest index" , 0 , findSmallest(new int [] {1, 2, 3} , "index") );
        assertEquals( "The smallest index" , 3 , findSmallest( new int [] {7, 12, 3, 2, 27} , "index") );
    }
}
