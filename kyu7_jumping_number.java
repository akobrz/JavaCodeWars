import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.stream.IntStream;

public class kyu7_jumping_number {
    public static String jumpingNumber(int number)
    {
        int[] a = String.valueOf(number).chars().toArray();
        int[] b = IntStream.range(1, a.length).filter(i->(a[i-1]-a[i])*(a[i-1]-a[i])==1).toArray();
        return number<10?"Jumping!!":a.length==b.length+1?"Jumping!!":"Not!!";
    }


    public static void main(String[] args) {
        assertEquals("Jumping!!", kyu7_jumping_number.jumpingNumber(1));
        assertEquals("Jumping!!", kyu7_jumping_number.jumpingNumber(23));
        assertEquals("Jumping!!", kyu7_jumping_number.jumpingNumber(32));
        assertEquals("Not!!", kyu7_jumping_number.jumpingNumber(79));
        assertEquals("Jumping!!", kyu7_jumping_number.jumpingNumber(98));
        assertEquals("Jumping!!", kyu7_jumping_number.jumpingNumber(98789876));
        assertEquals("Jumping!!", kyu7_jumping_number.jumpingNumber(4343456));
    }
}
