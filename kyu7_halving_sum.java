import java.util.stream.IntStream;

public class kyu7_halving_sum {

    static int halvingSum(int n) {
        return IntStream.iterate(n, x -> x != 0, x -> x/2).sum();
    }

    public static void main(String[] args) {
        System.out.println(halvingSum(25));
        System.out.println(halvingSum(127));
    }
}
