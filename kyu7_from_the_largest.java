import java.util.*;
import java.util.stream.Collectors;

public class kyu7_from_the_largest {
    public static long maxNumber(long n) {
        return Long
                .parseLong(
                        Arrays
                                .stream((""+n).split(""))
                                .sorted(Comparator.reverseOrder())
                                .collect(Collectors.joining())
                );
    }

    public static void main(String[] args) {
        System.out.println(maxNumber(79797979));
        System.out.println(maxNumber( 2399783));
        System.out.println(maxNumber(  566797));
        System.out.println(maxNumber(134976658));

    }
}
