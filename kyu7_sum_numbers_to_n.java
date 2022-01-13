import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class kyu7_sum_numbers_to_n {

    public static String showSequence(int value){
        return value<0?""+value+"<0":(value==0?"0=0":(IntStream.range(0, value+1).mapToObj(Integer::toString).collect(Collectors.joining("+"))+" = "+IntStream.range(0, value+1).sum()));
    }


    public static void main(String[] args) {
        System.out.println(showSequence(6));
        System.out.println(showSequence(-6));
        System.out.println(showSequence(0));
        System.out.println(showSequence(12));

    }
}
