import java.util.stream.IntStream;

public class kyu7_thinkful_string_drills {

    public static String repeat(String string,long n){
        return n>1?string+repeat(string, n-1):string;
    }

    public static void main(String[] args) {
        System.out.println(repeat("Na", 16));
        System.out.println(repeat("a",5));
        System.out.println(repeat("Wub ", 6));

    }
}
