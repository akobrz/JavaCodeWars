import java.util.Arrays;
import java.util.stream.IntStream;

public class kyu7_minimize_sum_arrays {

    public static int minSum(int[] passed)
    {
        Arrays.sort(passed);
        return IntStream.range(0, passed.length).map(i->passed[i]*passed[passed.length-1-i]).limit(passed.length/2).sum();
    }


    public static void main(String[] args) {
        System.out.println(minSum(new int[]{5,4,2,3}));
        System.out.println(minSum(new int[]{12,6,10,26,3,24}));
        System.out.println(minSum(new int[]{9,2,8,7,5,4,0,6}));
    }
}
