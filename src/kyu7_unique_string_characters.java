import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class kyu7_unique_string_characters {

    public static String solve(String a, String b){
        String a2 = Arrays.stream(a.split("")).filter(c->!b.contains(c)).collect(Collectors.joining());
        String b2 = Arrays.stream(b.split("")).filter(c->!a.contains(c)).collect(Collectors.joining());
        return a2+b2;
    }

    public static void main(String[] args) {
        assertEquals("ybzc", solve("xyab","xzca"));
        assertEquals("ybbzc", solve("xyabb","xzca"));
        assertEquals("abcdxyz", solve("abcd","xyz"));
        assertEquals("zca", solve("xxx","xzca"));
    }
}
