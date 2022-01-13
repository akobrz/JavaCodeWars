import java.util.stream.Collectors;

import static junit.framework.TestCase.assertEquals;

public class kyu7_switcheroo {

    public static String switcheroo(String x) {
        return x.chars().map(i->i=='a'?'d':i).map(i->i=='b'?'a':i).map(i->i=='d'?'b':i).mapToObj(v->""+(char)v).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        assertEquals("abc",kyu7_switcheroo.switcheroo( "bac"));
        assertEquals("ccc",kyu7_switcheroo.switcheroo("ccc"));
        assertEquals("aaabcccbaaa",kyu7_switcheroo.switcheroo("bbbacccabbb"));
    }
}
