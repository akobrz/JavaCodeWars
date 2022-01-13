import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.lang.Math.*;


public class kyu8_circles_in_polygons {

    public static class Polygon {
        int sides;
        int sideLength;

        public Polygon(int sides, int sideLength) {
            this.sides = sides;
            this.sideLength = sideLength;
        }

        public double circleDiameter(){
            double a = 1.0 * sideLength / (Math.tan(Math.PI/sides));
            System.out.println(a);
            return 1.0 * sideLength / (Math.tan(Math.PI/sides));
        }

    }

    public static void main(String[] args) {
        Polygon poly = new Polygon(8, 9);
        assertEquals("21.728", String.format("%.3f", poly.circleDiameter()));
        poly=new Polygon(3, 4);
        assertEquals("2.309", String.format("%.3f", poly.circleDiameter()));

    }
}
