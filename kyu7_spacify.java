import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class kyu7_spacify {
    public static String spacify(String str){
        return Arrays.stream(str.split("")).collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        assertEquals("h e l l o   w o r l d",kyu7_spacify.spacify("hello world"));
        assertEquals("1 2 3 4 5",kyu7_spacify.spacify("12345"));
    }
}
