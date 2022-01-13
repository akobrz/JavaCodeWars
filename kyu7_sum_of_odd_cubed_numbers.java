import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.stream.IntStream;

public class kyu7_sum_of_odd_cubed_numbers {
    public static int cubeOdd(int arr[]) {
        return IntStream.of(arr).map(v->v*v*v).filter(v->v%2!=0).sum();
    }

    public static void main(String[] args) {
        assertEquals(0, kyu7_sum_of_odd_cubed_numbers.cubeOdd(new int[] {-5, -5, 5, 5}));
        assertEquals(28, kyu7_sum_of_odd_cubed_numbers.cubeOdd(new int[] {1, 2, 3, 4}));
        assertEquals(0, kyu7_sum_of_odd_cubed_numbers.cubeOdd(new int[] {-3, -2, 2, 3}));
        assertEquals(0, kyu7_sum_of_odd_cubed_numbers.cubeOdd(new int[] {-4, -2, 2, 6}));
    }
}
