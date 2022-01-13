import java.util.stream.DoubleStream;

public class kyu8_wilson_primes {

    public static boolean am_i_wilson(double n) {

        double d = (get_factorial(n-1)+1)/(n*n);
        System.out.println(d);
        return (int)d == d;
    }

    public static double get_factorial(double n) {
        double ret = 1;
        for (int i = 1; i <= n; i++ ) {
            ret *= i;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(am_i_wilson(563));
        System.out.println(am_i_wilson(1));
        System.out.println(am_i_wilson(5));

    }


}
