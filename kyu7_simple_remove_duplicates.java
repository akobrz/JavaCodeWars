import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class kyu7_simple_remove_duplicates {
    public static int [] solve(int [] arr){

        return Arrays.stream(arr).mapToObj(v->v).sorted((a,b)->-1).distinct().sorted((a,b)->-1).mapToInt(v->v).toArray();
//        List<Integer> a = IntStream.of(arr).boxed().collect(Collectors.toList());
//        Collections.reverse(a);
//        List<Integer> b = a.stream().distinct().collect(Collectors.toList());
//        Collections.reverse(b);
//        return b.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{3,4,4,3,6,3}));
        System.out.println(solve(new int[]{1,2,1,2,1,2,3}));
        System.out.println(solve(new int[]{1,2,3,4}));
        System.out.println(solve(new int[]{1,1,4,5,1,2,1}));

    }
}
