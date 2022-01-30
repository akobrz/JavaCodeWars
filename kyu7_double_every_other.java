import java.util.stream.IntStream;

public class kyu7_double_every_other {

    public static int[] doubleEveryOther(int[] a){
        return IntStream.range(0, a.length).map(v->v%2==1?a[v]*2:a[v]).toArray();
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{1,2,3,4};
        int[] a1s = new int[]{1,4,3,8};
        int[] a2 = new int[]{1,19,6,2,12,-3};
        int[] a2s = new int[]{1,38,6,4,12,-6};
        int[] a3 = new int[]{-1000,1653,210,0,1};
        int[] a3s = new int[]{-1000,3306,210,0,1};

        doubleEveryOther(a3);

    }
}
