import java.util.Arrays;
import java.util.stream.Collectors;

public class kyu7_filter_number {

    public static long filterString(final String value) {
        return Long.parseLong(value.replaceAll("[a-z]", ""));
//        return Long.parseLong(Arrays.stream(value.split("")).filter(v->v.compareTo("Z")<0).collect(Collectors.joining()));
    }

    public static void main(String[] args) {
        System.out.println(filterString("123"));
        System.out.println(filterString("a1b2c3"));
        System.out.println(filterString("aa1bb2cc3dd"));
    }
}
