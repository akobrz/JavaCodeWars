import java.util.Arrays;
import java.util.stream.Collectors;

public class kyu7_sort_the_gift_code {
    public static String sortGiftCode(String code){
        return Arrays.stream(code.split("")).sorted().collect(Collectors.joining());
    }

    public static void main(String[] args) {

        System.out.println(sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }
}
