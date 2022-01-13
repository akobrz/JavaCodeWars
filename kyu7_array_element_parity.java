import java.util.stream.IntStream;

import static junit.framework.TestCase.assertEquals;

public class kyu7_array_element_parity {
    public static int solve(int [] arr){
        return IntStream.of(arr).distinct().sum();
    }

    public static void main(String[] args) {
        assertEquals(3,solve(new int [] {1,-1,2,-2,3}));
        assertEquals(-4,solve(new int [] {-3,1,2,3,-1,-4,-2}));
        assertEquals(3,solve(new int [] {1,-1,2,-2,3,3}));
        assertEquals(-38,solve(new int [] {-110,110,-38,-38,-62,62,-38,-38,-38}));
        assertEquals(-9,solve(new int [] {-9,-105,-9,-9,-9,-9,105}));

    }
}
