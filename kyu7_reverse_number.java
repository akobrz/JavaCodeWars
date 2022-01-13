import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class kyu7_reverse_number {

    public static int old_reverse(int number) {
        List<String> l = Arrays.stream(String.valueOf(number>0?number:-number).split("")).collect(Collectors.toList());
        Collections.reverse(l);
        String s = String.join("", l);
        return number>0?Integer.parseInt(s):-Integer.parseInt(s);
    }

    public static int reverse(int number) {
        return number>0?Integer.parseInt(new StringBuilder().append(number).reverse().toString()):-reverse(-number);
    }


    public static void main(String[] args) {
        System.out.println(reverse( 123 ));
        System.out.println(reverse( 4321234 ));
        System.out.println(reverse( -123 ));
    }


}
