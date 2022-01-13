import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class kyu7_folding_your_way_to_moon {

    public static Long fold(Double distance) {
        double n = (Math.log(distance) - Math.log(0.0001))/Math.log(2);
        return distance<0?null:Math.ceil(n)<0?0:(long)Math.ceil(n);
    }


    public static void main(String[] args) {
        assertEquals((Long)42L, fold(384000000.0));
        assertEquals((Long)null, fold(-384000000.0));
        assertEquals((Long)0L, fold(0.00005));
    }


}
