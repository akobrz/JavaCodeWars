import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class kyu7_numbers_in_strings {

    public static int solve(String s){
        String str = Arrays.stream(s.split("")).map(v->v.compareTo("Z")>0?" ":v).collect(Collectors.joining());
        return Arrays.stream(str.split(" ")).filter(v->!(v.equals(" ")||v.equals(""))).mapToInt(Integer::parseInt).max().getAsInt();
    }

    public static void main(String[] args) {
        assertEquals(9,solve("2ti9iei7qhr5"));
        assertEquals(695,solve("gh12cdy695m1"));
        assertEquals(85,solve("lu1j8qbbb85"));
        assertEquals(185,solve("185lu1j8qbbb85"));
    }
}
