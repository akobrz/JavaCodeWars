import java.util.Arrays;
import java.util.stream.IntStream;

public class kyu7_sum_array_singles {

    public static int repeats(int [] arr){
        return 2*IntStream.of(arr).distinct().sum()-IntStream.of(arr).sum();
//        return Arrays.stream(arr).mapToObj(v->Arrays.stream(arr).filter(i->i==v).count()==2?0:v).mapToInt(v->v).sum();
    }


    public static void main(String[] args) {
        System.out.println(repeats(new int []{4,5,7,5,4,8}));
        System.out.println(repeats(new int []{9, 10, 19, 13, 19, 13}));
        System.out.println(repeats(new int []{16, 0, 11, 4, 8, 16, 0, 11}));

    }
}
