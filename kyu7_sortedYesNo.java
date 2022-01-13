import java.util.Arrays;
import java.util.stream.IntStream;

public class kyu7_sortedYesNo {
    public static void main(String[] args) {
        int[] array1 = new int[] {1, 2, 6, 8, 10};
        int[] array2 = new int[] {15, 7, 3, -8, -12};
        int[] array3 = new int[] {15, -12, 3, 8, 12};

        System.out.println(isSortedAndHow(array1));
        System.out.println(isSortedAndHow(array2));
        System.out.println(isSortedAndHow(array3));

    }

    public static String isSortedAndHow(int[] array) {
        int[] ret1 = IntStream.of(array).sorted().toArray();
        int[] ret2 = IntStream.of(array).map(i->-i).sorted().map(i->-i).toArray();

        return Arrays.equals(ret1, array)?"yes, ascending":Arrays.equals(ret2, array)?"yes, descending":"no";
    }
}
