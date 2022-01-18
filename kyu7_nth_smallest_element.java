import java.util.Arrays;

public class kyu7_nth_smallest_element {
    public static int nthSmallest(final int[] arr, final int n) {
        return Arrays.stream(arr).sorted().toArray()[n-1];
    }

    public static void main(String[] args) {
        System.out.println(nthSmallest(new int[]{-102, -16, -1, -2, -367, -9}, 5));
        System.out.println(nthSmallest(new int[]{177, 225, 243, -169, -12, -5, 2, 92}, 5));
        System.out.println(nthSmallest(new int[]{-102, -16, -1, -2, -367, -9}, 5));

    }
}
