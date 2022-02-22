import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class kyu7_all_star_challenge_22 {

    public static String toTime(int seconds){
        return String.format("%d hour(s) and %d minute(s)", seconds/3600, seconds%3600/60);
    }

    public static void main(String[] args) {
        assertEquals("1 hour(s) and 0 minute(s)", toTime(3600));
        assertEquals("1 hour(s) and 0 minute(s)", toTime(3601));
        assertEquals("0 hour(s) and 58 minute(s)", toTime(3500));
        assertEquals("89 hour(s) and 51 minute(s)", toTime(323500));
        assertEquals("0 hour(s) and 0 minute(s)", toTime(0));
    }
}
