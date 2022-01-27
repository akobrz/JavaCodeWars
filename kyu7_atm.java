import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class kyu7_atm {

    public int solve(int n) {
        int counter = 0;

        while (n>0){
            if (n-500>=0){
                n-=500;
            } else if (n-200>=0){
                n-=200;
            } else if (n-100>=0){
                n-=100;
            } else if (n-50>=0){
                n-=50;
            } else if (n-20>=0){
                n-=20;
            } else if (n-10>=0){
                n-=10;
            } else if (n-10<0){
                return -1;
            }
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        assertEquals(4, new kyu7_atm().solve(770));
        assertEquals(-1, new kyu7_atm().solve(125));
        assertEquals(2, new kyu7_atm().solve(550));
        assertEquals(1, new kyu7_atm().solve(10));
        assertEquals(-1, new kyu7_atm().solve(238));
    }
}
