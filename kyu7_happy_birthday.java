import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.stream.Stream;

public class kyu7_happy_birthday {

    public static int wrap(int height, int width, int length){
        int[] a = Stream.of(height, width, length).sorted().mapToInt(v->v).toArray();
        return 2*a[2]+4*a[0]+2*a[1]+20;
    }

    public static void main(String[] args) {
        assertEquals(162, wrap(17,32,11));
        assertEquals(124, wrap(13,13,13));
        assertEquals(32, wrap(1,3,1));
    }
}
