import java.util.OptionalInt;
import java.util.stream.IntStream;

public class kyu7_maximum_product {
    public static int adjacentElementsProduct(int[] array) {
        return IntStream.range(0, array.length-1).map(i -> array[i]*array[i+1]).max().orElse(0);
    }


    public static void main(String[] args) {
        System.out.println(adjacentElementsProduct(new int[] {3, 6, -2, -5, 7, 3}));
        System.out.println(adjacentElementsProduct(new int[] {9, 5, 10, 2, 24, -1, -48}));
        System.out.println(adjacentElementsProduct(new int[] {-23, 4, -5, 99, -27, 329, -2, 7, -921}));

    }
}
