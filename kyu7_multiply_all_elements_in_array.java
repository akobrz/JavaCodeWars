import java.util.function.Function;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class kyu7_multiply_all_elements_in_array {

    public static Function<Integer, int[]> multiplyAll(int[] array) {
        return (n) -> IntStream.of(array).map(v->v*n).toArray();
    }

    public static void main(String[] args) {
        assertArrayEquals(new int[]{1, 2, 3}, multiplyAll(new int[]{1, 2, 3}).apply(1));
        assertArrayEquals(new int[]{2, 4, 6}, multiplyAll(new int[]{1, 2, 3}).apply(2));
        assertArrayEquals(new int[]{0, 0, 0}, multiplyAll(new int[]{1, 2, 3}).apply(0));
        assertArrayEquals(new int[0], multiplyAll(new int[0]).apply(10), "should return an empty array");
    }
}
