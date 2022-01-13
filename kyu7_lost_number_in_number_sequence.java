import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class kyu7_lost_number_in_number_sequence {

    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        return Arrays.stream(arr).sum()-Arrays.stream(mixedArr).sum();
    }

    public static void main(String[] args) {
        assertEquals(2, kyu7_lost_number_in_number_sequence.findDeletedNumber(new int[]{1,2,3,4,5}, new int[]{3,4,1,5}));
        assertEquals(5, kyu7_lost_number_in_number_sequence.findDeletedNumber(new int[]{1,2,3,4,5,6,7,8,9}, new int[]{1,9,7,4,6,2,3,8}));
        assertEquals(0, kyu7_lost_number_in_number_sequence.findDeletedNumber(new int[]{1,2,3,4,5,6,7,8,9}, new int[]{5,7,6,9,4,8,1,2,3}));

    }
}
