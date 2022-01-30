import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class kyu7_spoonerize_me {

    public static String spoonerize(String words) {
        String[] s = words.split(" ");
        return s[1].charAt(0) + s[0].substring(1) + " " + s[0].charAt(0) + s[1].substring(1);
    }

    public static void main(String[] args) {
        assertEquals("pit nicking", kyu7_spoonerize_me.spoonerize("nit picking"));
        assertEquals("bedding wells", kyu7_spoonerize_me.spoonerize("wedding bells"));
        assertEquals("belly jeans", kyu7_spoonerize_me.spoonerize("jelly beans"));
    }
}
