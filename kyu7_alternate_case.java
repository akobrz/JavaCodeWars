import java.util.stream.Collectors;
import static junit.framework.TestCase.assertEquals;

public class kyu7_alternate_case {
    static String alternateCase(final String string) {
        return string.chars()
                .mapToObj(v->""+(char)(v>='A'&&v<='Z'?v+32:v>='a'&&v<='z'?v-32:v))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        assertEquals("", kyu7_alternate_case.alternateCase(""));
        assertEquals("ABC", kyu7_alternate_case.alternateCase("abc"));
        assertEquals("abc", kyu7_alternate_case.alternateCase("ABC"));
        assertEquals("hELLO wORLD!", kyu7_alternate_case.alternateCase("Hello World!"));
    }
}
