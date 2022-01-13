import java.util.stream.Collectors;

import static junit.framework.TestCase.assertEquals;

public class kyu7_tidy_number {
    public static void main(String[] args) {
        assertEquals(true,  kyu7_tidy_number.tidyNumber(12));
        assertEquals(false, kyu7_tidy_number.tidyNumber(32));
        assertEquals(true,  kyu7_tidy_number.tidyNumber(39));
    }

    public static boolean tidyNumber(int number)
    {
        return String.valueOf(number).chars().sorted().mapToObj(v->""+(char)v).collect(Collectors.joining()).equals(String.valueOf(number));
    }

}
