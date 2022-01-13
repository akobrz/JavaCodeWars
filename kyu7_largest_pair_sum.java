import java.util.Arrays;

public class kyu7_largest_pair_sum {
    public static void main(String[] args) {
        System.out.println(largestPairSum(new int[]{10,14,2,23,19}));
        System.out.println(largestPairSum(new int[]{-100,-29,-24,-19,19}));
        System.out.println(largestPairSum(new int[]{1,2,3,4,6,-1,2}));
        System.out.println(largestPairSum(new int[]{-10,-8,-16,-18,-19}));

    }

    public static int largestPairSum(int[] numbers){
        return Arrays.stream(numbers).map(x->-x).sorted().map(x->-x).limit(2).sum();
    }

}
