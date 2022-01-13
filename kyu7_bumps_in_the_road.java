import java.util.Arrays;

public class kyu7_bumps_in_the_road {

    public static String bumps(final String road) {
        return road.chars().filter(c -> c == 'n').count()>15?"Car Dead":"Woohoo!";
    }

    public static void main(String[] args) {
        System.out.println(bumps("_nnnnnnn_n__n______nn__nn_nnn"));
        System.out.println(bumps("______n___n_"));
        System.out.println(bumps("nnnnnnnnnnnnnnnnnnnnn"));

    }
}
