import org.junit.jupiter.api.Test;

import java.util.OptionalInt;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class kyu7_previous_multiple_of_three {

    public static Integer prevMultOfThree(int n){
        String s = String.valueOf(n);
        return IntStream.range(0, s.length()).map(v->Integer.parseInt(s.substring(0, s.length()-v))).boxed().filter(v->v%3==0).findFirst().orElse(null);
    }

    public static void main(String[] args) {
        assertEquals(null, prevMultOfThree(1), "For input 1");
        assertEquals(null, prevMultOfThree(25), "For input 25");
        assertEquals(36, prevMultOfThree(36), "For input 36");
        assertEquals(12, prevMultOfThree(1244), "For input 1244");
        assertEquals(9, prevMultOfThree(952406), "For input 952406");
    }
}
