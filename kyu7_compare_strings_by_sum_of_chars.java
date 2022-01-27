import java.util.Optional;

import static org.junit.Assert.*;

public class kyu7_compare_strings_by_sum_of_chars {

    public static boolean compare(String s1, String s2) {
        int n1 = (s1!=null&&s1.matches("[A-Z]+"))?s1.toUpperCase().chars().sum():0;
        int n2 = (s2!=null&&s2.matches("[A-Z]+"))?s2.toUpperCase().chars().sum():0;
        return n1 == n2;
    }

    public static boolean compare1(String s1, String s2) {
        s1 = (s1==null?"":s1.toUpperCase().chars().filter(v->v<65||v>90).count()>0?"":s1);
        s2 = (s2==null?"":s2.toUpperCase().chars().filter(v->v<65||v>90).count()>0?"":s2);
        return s1.toUpperCase().chars().sum() == s2.toUpperCase().chars().sum();
    }

    public static void main(String[] args) {
        assertTrue(compare("AD", "BC"));
        assertTrue(compare("zz1", ""));
        assertFalse(compare("AD", "DD"));
        assertTrue(compare(null, ""));
    }
}
