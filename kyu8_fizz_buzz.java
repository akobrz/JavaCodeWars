import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class kyu8_fizz_buzz {

    public static String fizz_buzz(int n){
        return IntStream.rangeClosed(1, n).mapToObj(v->v%15==0?"FizzBuzz":v%5==0?"Fizz":v%3==0?"Buzz":""+v).collect(Collectors.joining());
    }
    public static void main(String[] args) {
        System.out.println(fizz_buzz(50));
    }
}
