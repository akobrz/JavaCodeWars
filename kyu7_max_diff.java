import java.util.stream.IntStream;
import static junit.framework.TestCase.assertEquals;

public class kyu7_max_diff {
    public static void main(String[] args) {
        assertEquals("only positives", 4, kyu7_max_diff.maxDiff(new int[]{ 1, 2, 3, 4, 5, 5, 4 }));
        assertEquals("only negatives", 30, kyu7_max_diff.maxDiff(new int[]{ -4, -5, -3, -1, -31 }));
        assertEquals("positives and negatives", 10, kyu7_max_diff.maxDiff(new int[]{ 1, 2, 3, 4, -5, 5, 4 }));
        assertEquals("single element", 0, kyu7_max_diff.maxDiff(new int[]{ 1000000 }));
        assertEquals("empty", 0, kyu7_max_diff.maxDiff(new int[]{}));
    }

    public static int maxDiff(int[] lst) {
        return IntStream.of(lst).max().orElse(0) - IntStream.of(lst).min().orElse(0);
    }

}
