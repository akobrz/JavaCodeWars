public class kyu7_string_merge {


    public static String stringMerge(String s1, String s2, char letter) {
        return s1.substring(0, s1.indexOf(letter)) + s2.substring(s2.indexOf(letter));
    }

    public static void main(String[] args) {
        System.out.println(stringMerge("abcdefxxxyzz","abcxxxyyyxyzz", 'x'));
    }
}
