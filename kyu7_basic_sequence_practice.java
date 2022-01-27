import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class kyu7_basic_sequence_practice {

    public static int[] sumOfN(int n) {
        return IntStream.range(0, Math.abs(n)+1).map(i->(n>0?i*(i+1)/2:-i*(i+1)/2)).toArray();
    }

    public static void main(String[] args) {
        assertArrayEquals(new int[]{0, 1, 3, 6}, sumOfN(3));
        assertArrayEquals(new int[]{0, -1, -3, -6, -10}, sumOfN(-4));
        assertArrayEquals(new int[]{0, 1}, sumOfN(1));
        assertArrayEquals(new int[]{0}, sumOfN(0));
    }
}
