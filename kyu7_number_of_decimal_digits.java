import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class kyu7_number_of_decimal_digits {

    public static int Digits(long n) {
        return String.valueOf(n).length();
    }

    public static void main(String[] args) {
        assertEquals(1,  kyu7_number_of_decimal_digits.Digits(5l));
        assertEquals(5,  kyu7_number_of_decimal_digits.Digits(12345l));
        assertEquals(10, kyu7_number_of_decimal_digits.Digits(9876543210l));
    }
}
