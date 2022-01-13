import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;

public class kyu7_basic_calculator {

    public static Double calculate(final double numberOne, final String operation, final double numberTwo)
    {
        switch(operation){
            case "+":
                return numberOne+numberTwo;
            case "-":
                return numberOne-numberTwo;
            case "*":
                return (double)numberOne*numberTwo;
            case "/":
                if (numberTwo == 0)
                    return null;
                else
                    return numberOne/numberTwo;
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        assertEquals("3.2 + 8 = 11.2",new Double(11.2),kyu7_basic_calculator.calculate(3.2,"+", 8));
        assertEquals("3.2 - 8 = -4.8",new Double(-4.8),kyu7_basic_calculator.calculate(3.2,"-", 8));
        assertEquals("3.2 / 8 = .4",new Double(0.4),kyu7_basic_calculator.calculate(3.2,"/", 8));
        assertEquals("3.2 * 8 = 25.6",new Double(25.6),kyu7_basic_calculator.calculate(3.2,"*", 8));
        assertEquals("-3 + 0 = -3",new Double(-3),kyu7_basic_calculator.calculate(-3,"+", 0));
        assertEquals("-3 - 0 = -3",new Double(-3),kyu7_basic_calculator.calculate(-3,"-", 0));
        assertEquals("-3 / 0 = null",null,kyu7_basic_calculator.calculate(-3,"/", 0));
        assertEquals("-2 / -2 = 1",new Double(1),kyu7_basic_calculator.calculate(-2, "/", -2));
        assertEquals("-3 * 0 = 0",new Double(0),kyu7_basic_calculator.calculate(-3,"*", 0));
        assertEquals("-3 w 0 = null",null,kyu7_basic_calculator.calculate(-3,"w", 0));

    }
}
