import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class kyu7_array_leaders {
    public static List arrayLeaders(int[] numbers)
    {
        return IntStream.range(0, numbers.length).filter(i->numbers[i]>IntStream.range(i+1, numbers.length).map(j->numbers[j]).sum()).mapToObj(i->numbers[i]).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        assertEquals(Arrays.asList(4), kyu7_array_leaders.arrayLeaders(new int[]{1,2,3,4,0}));
        assertEquals(Arrays.asList(17,5,2), kyu7_array_leaders.arrayLeaders(new int[]{16,17,4,3,5,2}));
        assertEquals(Arrays.asList(-1), kyu7_array_leaders.arrayLeaders(new int[]{-1,-29,-26,-2}));
        assertEquals(Arrays.asList(-36,-12), kyu7_array_leaders.arrayLeaders(new int[]{-36,-12,-27}));
        assertEquals(Arrays.asList(5,2), kyu7_array_leaders.arrayLeaders(new int[]{5,2}));
        assertEquals(Arrays.asList(0,-1,3,2), kyu7_array_leaders.arrayLeaders(new int[]{0,-1,-29,3,2}));
    }
}
