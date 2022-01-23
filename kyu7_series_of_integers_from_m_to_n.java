import java.util.stream.IntStream;

public class kyu7_series_of_integers_from_m_to_n {

    public static int[] generateIntegers(final int m, final int n) {
        return IntStream.rangeClosed(m, n).toArray();
    }

    public static void main(String[] args) {
        System.out.println(generateIntegers(2, 5));

    }
}
