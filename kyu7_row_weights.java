import java.util.Arrays;
import java.util.stream.IntStream;

public class kyu7_row_weights {

    public static int[] rowWeights (final int[] weights)
    {
        return IntStream.rangeClosed(0, 1).map(i->IntStream.range(0, weights.length).map(n->(n%2==i)?weights[n]:0).sum()).toArray();
    }


    public static void main(String[] args) {
        System.out.println(rowWeights(new int[]{80}));
        System.out.println(rowWeights(new int[]{100,50}));
        System.out.println(rowWeights(new int[]{50,60,70,80}));

    }


}
