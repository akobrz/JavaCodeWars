import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class kyu7_valid_spacing {

    public static boolean validSpacing(String s) {
        return s.equals(s.trim().replaceAll("  ", " "));
    }

    public static void main(String[] args) {
        assertTrue (validSpacing("Hello world"), "'Hello world'");
        assertFalse(validSpacing(" Hello world"), "' Hello world'");
        assertFalse(validSpacing("Hello  world "), "'Hello  world '");
        assertTrue (validSpacing("Hello"), "'Hello'");
        assertTrue (validSpacing("Helloworld"), "'Helloworld'");
    }
}
