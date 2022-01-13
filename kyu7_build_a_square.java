import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class kyu7_build_a_square {
    public static void main(String[] args) {
        assertEquals("+++\n+++\n+++", generateShape(3));
        assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", generateShape(5));
        assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", generateShape(8));
    }

    public static final String generateShape(int n) {
        return IntStream.range(0, n).mapToObj(c->"+".repeat(n)).collect(Collectors.joining("\n"));
    }
}
