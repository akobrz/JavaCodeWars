import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class kyu7_to_leet_speak {

    static String toLeetSpeak(final String speak) {
        return speak
                .replaceAll("A", "@")
                .replaceAll("B", "8")
                .replaceAll("C", "(")
                .replaceAll("E", "3")
                .replaceAll("G", "6")
                .replaceAll("H", "#")
                .replaceAll("I", "!")
                .replaceAll("L", "1")
                .replaceAll("O", "0")
                .replaceAll("S", "\\$")
                .replaceAll("T", "7")
                .replaceAll("Z", "2");
    }

    public static void main(String[] args) {
        assertEquals("1337", toLeetSpeak("LEET"));
        assertEquals("#3110 W0R1D", toLeetSpeak("HELLO WORLD"));
        assertEquals("10R3M !P$UM D010R $!7 @M37", toLeetSpeak("LOREM IPSUM DOLOR SIT AMET"));
        assertEquals("7#3 QU!(K 8R0WN F0X JUMP$ 0V3R 7#3 1@2Y D06", toLeetSpeak("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
        assertEquals("(0D3W@R$", toLeetSpeak("CODEWARS"));

    }
}
