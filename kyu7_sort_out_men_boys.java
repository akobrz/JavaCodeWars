import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class kyu7_sort_out_men_boys {

    public static int[] menFromBoys(final int[] values) {
        return IntStream.concat(Arrays.stream(values).distinct().filter(x->x%2==0).sorted(), Arrays.stream(values).distinct().filter(x->x%2==1||x%2==-1).map(x->-x).sorted().map(x->-x)).toArray();
    }

    public static void main(String[] args) {
        System.out.println(menFromBoys(new int[]{-78,-38,12,89}));
        System.out.println(menFromBoys(new int[]{-90,2,95,37,-43}));
        System.out.println(menFromBoys(new int[]{-282,49,818,900,928,281,49,-1}));

    }

}
