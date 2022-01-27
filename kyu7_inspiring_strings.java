import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class kyu7_inspiring_strings {

    public static String longestWord(String wordString) {
//        return Arrays.stream(wordString.split(" ")).sorted((x, y)->-1).sorted((x, y)->(x.length()>y.length()?-1:x.length()==y.length()?0:1)).findFirst().get();
        return Arrays.stream(wordString.split(" ")).sorted((x, y)->-1).min((x, y) -> (Integer.compare(y.length(), x.length()))).get();
    }

    public static void main(String[] args) {
        assertEquals("fgh", longestWord("a b c d e fgh"));
        assertEquals("three", longestWord("one two three"));
        assertEquals("grey", longestWord("red blue grey"));
    }
}
