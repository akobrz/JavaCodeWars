import java.util.stream.IntStream;

public class kyu7_sum_triangular {

    public static int sumTriangularNumbers(int n)
    {
        return IntStream.rangeClosed(1, n).map(i->i*(i+1)/2).sum();
    }

    public static void main(String[] args) {
        System.out.println(sumTriangularNumbers(4));
        System.out.println(sumTriangularNumbers(6));
        System.out.println(sumTriangularNumbers(34));
        System.out.println(sumTriangularNumbers(-971));

    }
}
