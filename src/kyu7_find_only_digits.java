import java.util.Arrays;
import java.util.stream.Collectors;

public class kyu7_find_only_digits {

    public static String onlyDigits(String s){
        return s.chars().filter(Character::isDigit).mapToObj(c->""+(char)c).collect(Collectors.joining());
    }


    public static void main(String[] args) {
        String d = onlyDigits("12-34#567 R89");
        String d1 = d.substring(0,2);
        String d2 = d.substring(2,8);
        String d3 = d.substring(8);

        String e = String.join("-", d1, d2, d3);

        System.out.println(e);


    }
}
