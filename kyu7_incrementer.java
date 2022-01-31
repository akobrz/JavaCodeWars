import java.util.stream.IntStream;

public class kyu7_incrementer {

    public static int[] incrementer(int[] numbers) {
        return IntStream.range(0, numbers.length).map(v->(v+1+numbers[v])%10).toArray();
    }

    public static void main(String[] args) {
        incrementer(new int[]{2, 4, 6, 8, 0, 2, 4, 6, 8, 9, 0, 1, 2, 2});


    }
}
