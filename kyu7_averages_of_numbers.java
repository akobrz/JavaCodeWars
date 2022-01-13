import java.util.Arrays;
import java.util.stream.IntStream;

public class kyu7_averages_of_numbers {
    public static void main(String[] args) {
        System.out.println(averages(new int[] { 2, 2, 2, 2, 2 }));
        System.out.println(averages(new int[] { 2, -2, 2, -2, 2 }));
        System.out.println(averages(new int[] { 1, 3, 5, 1, -10 }));
        System.out.println(averages(new int[] { }));
    }

    public static double[] averages(int[] numbers)
    {
        return numbers==null?new double[]{}:IntStream.range(0, numbers.length-1).mapToDouble(v->(numbers[v]*1.0 + numbers[v+1])/2).limit(numbers.length-1).toArray();
    }
}
