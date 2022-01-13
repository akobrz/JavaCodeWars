import java.text.DecimalFormat;

public class kyu8_localize_barycenter {

    public static double[] barTriang(double[] x, double[] y, double[] z)
    {
        double[] a = new double[]{(x[0]+y[0]+z[0])/3, (x[1]+y[1]+z[1])/3};
        double a1 = Double.valueOf(String.format("%.5f", a[0]).replace(",", "."));
        double a2 = Double.valueOf(String.format("%.5f", a[1]).replace(",", "."));
        return new double[]{a1, a2};
    }

    public static void main(String[] args) {
        System.out.println(barTriang(new double[]{4,6}, new double[]{12,4}, new double[]{10,10}));
        System.out.println(barTriang(new double[]{4,2}, new double[]{12,2}, new double[]{6,10}));
    }
}
