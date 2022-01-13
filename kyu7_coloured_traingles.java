import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class kyu7_coloured_traingles {
    public static void main(String[] args) {
//        assertEquals('R', triangle("GB"));
//        assertEquals('R', triangle("RRR"));
        assertEquals('B', triangle("RGBG"));
        assertEquals('G', triangle("RBRGBRB"));
//        assertEquals('G', triangle("RBRGBRBGGRRRBGBBBGG"));
//        assertEquals('B', triangle("B"));

    }

    public static char triangle(final String row) {
        return row.length() == 1?row.charAt(0):triangle(IntStream.range(0, row.length()-1).mapToObj(i->""+(char)get_third(row.charAt(i), row.charAt(i+1))).collect(Collectors.joining()));
    }

    public static int get_third(int a, int b){
        return a==b?a:"RGB".chars().filter(c -> c!=a && c!=b).findFirst().getAsInt();
    }

}
