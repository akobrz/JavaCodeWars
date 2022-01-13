import java.util.Arrays;


import static org.junit.Assert.assertArrayEquals;

public class kyu7_help_fruit_guy {
    public static void main(String[] args) {
        String[] rotten = new String []{"rottenApple","rottenBanana","rottenApple","rottenPineapple","rottenKiwi"};
        String [] expected = new String []{"apple","banana","apple","pineapple","kiwi"};
        assertArrayEquals(expected, kyu7_help_fruit_guy.removeRotten(rotten));

        String[] rotten2 = new String []{};
        String [] expected2 = new String []{};
        assertArrayEquals(expected2, kyu7_help_fruit_guy.removeRotten(rotten2));

        String[] rotten3 = null;
        String [] expected3 = new String []{};
        assertArrayEquals(expected3, kyu7_help_fruit_guy.removeRotten(rotten3));

    }


    public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket == null)
            return new String[]{};
        Object[] a = Arrays.stream(fruitBasket).map(v->v.contains("rotten")?v.substring(6).toLowerCase():v).toArray();
        return a.length>0?Arrays.copyOf(a, a.length, String[].class):new String[]{};
    }

}
