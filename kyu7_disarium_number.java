import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.stream.IntStream;

public class kyu7_disarium_number {

    public static String disariumNumber(int number)
    {
        int[] a = String.valueOf(number).chars().toArray();
        return number==IntStream.range(0, a.length).map(i->(int)Math.pow(a[i]-48, i+1)).sum()?"Disarium !!":"Not !!";
    }

    public static void main(String[] args) {
        assertEquals("Not !!", kyu7_disarium_number.disariumNumber(90));
        assertEquals("Disarium !!", kyu7_disarium_number.disariumNumber(89));
        assertEquals("Not !!", kyu7_disarium_number.disariumNumber(564));
        assertEquals("Not !!", kyu7_disarium_number.disariumNumber(1024));
    }
}
