import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.Arrays;

public class kyu7_maximum_triplet_sum {


    public static int maxTriSum (int[] numbers)
    {
        return Arrays.stream(numbers).map(x->-x).sorted().map(x->-x).distinct().limit(3).sum();
    }

    public static void main(String[] args) {
        assertEquals(17, kyu7_maximum_triplet_sum.maxTriSum(new int[]{3,2,6,8,2,3}));
        assertEquals(32, kyu7_maximum_triplet_sum.maxTriSum(new int[]{2,9,13,10,5,2,9,5}));
        assertEquals(18, kyu7_maximum_triplet_sum.maxTriSum(new int[]{2,1,8,0,6,4,8,6,2,4}));
    }


}
