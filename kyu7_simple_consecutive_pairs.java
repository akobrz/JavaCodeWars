import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.stream.IntStream;

public class kyu7_simple_consecutive_pairs {

    public static int solve(int [] arr){
        return IntStream.iterate(0, i->i<arr.length-1, i->i+2).filter(i->(arr[i]-arr[i+1])*(arr[i]-arr[i+1])==1).toArray().length;
    }


    public static void main(String[] args) {
        assertEquals(3,kyu7_simple_consecutive_pairs.solve(new int[]{1,2,5,8,-4,-3,7,6,5}));
        assertEquals(2,kyu7_simple_consecutive_pairs.solve(new int[]{21, 20, 22, 40, 39, -56, 30, -55, 95, 94}));
        assertEquals(0,kyu7_simple_consecutive_pairs.solve(new int[]{81, 44, 80, 26, 12, 27, -34, 37, -35}));
        assertEquals(4,kyu7_simple_consecutive_pairs.solve(new int[]{-55, -56, -7, -6, 56, 55, 63, 62}));
    }
}
