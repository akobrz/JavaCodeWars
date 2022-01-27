import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import static java.util.stream.IntStream.of;

public class kyu7_count_all_the_sheep_on_farm {
    public static int lostSheep(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepTotal) {
        return sheepTotal-of(fridayNightCounting).sum()-of(saturdayNightCounting).sum();
    }

    public static void main(String[] args) {
        assertEquals(5, lostSheep(new int[] {1,2}, new int[] {3,4}, 15));
        assertEquals(6, lostSheep(new int[] {3,1,2}, new int[] {4,5}, 21));
    }
}
