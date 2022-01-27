import static org.junit.Assert.assertEquals;
import java.util.*;

public class kyu7_product_of_maximus_of_array {


    public static long maxProduct(int[] numbers, int sub_size)
    {
        return Arrays.stream(numbers).sorted().skip(numbers.length-sub_size).asLongStream().reduce((x, y)->{return x*y;}).orElse(0);
    }

    public static void main(String[] args) {
        assertEquals(20, maxProduct(new int[]{4,3,5}, 2));
        assertEquals(720, maxProduct(new int[]{10,8,7,9}, 3));
        assertEquals(288, maxProduct(new int[]{8,6,4,6}, 3));
    }
}
