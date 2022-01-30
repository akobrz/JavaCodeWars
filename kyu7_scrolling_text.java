import java.util.stream.IntStream;

public class kyu7_scrolling_text {

    public static String[] scrollingText(String text) {
        return IntStream.range(0, text.length()).mapToObj(v->text.substring(v)+text.substring(0, v)).map(String::toUpperCase).toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(scrollingText("codewars"));
        System.out.println(scrollingText("good luck!"));
    }

}
