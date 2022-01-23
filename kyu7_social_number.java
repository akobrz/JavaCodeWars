import org.junit.Test;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class kyu7_social_number {
    public static String specialNumber(int number)
    {
        return Arrays.stream((""+number).split("")).filter(v->parseInt(v)<6).collect(Collectors.joining()).length()==(""+number).length()?"Special!!":"NOT!!";
//        return (""+number).matches("[0-5]+")?"Special!!":"NOT!!";
    }

    public static void main(String[] args) {
        assertEquals("Special!!", specialNumber(2));
        assertEquals("Special!!", specialNumber(3));
        assertEquals("NOT!!", specialNumber(9));
        assertEquals("NOT!!", specialNumber(7));

    }
}
