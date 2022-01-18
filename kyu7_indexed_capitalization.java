import java.util.Arrays;
import java.util.stream.Collectors;

public class kyu7_indexed_capitalization {
    public static String capitalize(String s, int[] ind){
        String[] ss = s.split("");
        Arrays.stream(ind).filter(i->i<=s.length()).forEach(i->ss[i]=ss[i].toUpperCase());
        return String.join("", ss);
    }

    public static void main(String[] args) {
        System.out.println(capitalize("abcdef", new int[]{1,2,5}));
        System.out.println(capitalize("abcdef", new int[]{1,2,5,100}));
        System.out.println(capitalize("codewars", new int[]{1,3,5,50}));
        System.out.println(capitalize("abracadabra", new int[]{2,6,9,10}));

    }
}
