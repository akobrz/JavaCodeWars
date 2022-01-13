import java.util.stream.IntStream;
import static org.junit.Assert.assertArrayEquals;

public class kyu7_return_first_m_multiplies_n {

    public static int[] multiples(int m, double n) {
        return IntStream.iterate((int)n, v->v<=m*n, v->v+(int)n).toArray();
    }

    public static void main(String[] args) {
        assertArrayEquals(new int[] {5, 10, 15}, kyu7_return_first_m_multiplies_n.multiples(3, 5.0));
        assertArrayEquals(new int[] {2, 4, 6, 8}, kyu7_return_first_m_multiplies_n.multiples(4, 2));
    }
}
