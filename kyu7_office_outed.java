import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.Arrays;

public class kyu7_office_outed {

    static class Person {
        final String name;
        final int happiness;

        public Person(String name, int happiness) {
            this.name = name;
            this.happiness = happiness;
        }
    }

    public static String outed(Person[] meet, String boss) {
        return Arrays.stream(meet).mapToInt(v->(v.name.equals(boss)?v.happiness*2:v.happiness)).sum()/meet.length>5?"Nice Work Champ!":"Get Out Now!";
    }


    public static void main(String[] args) {
        Person[] meet = new Person[] {
                new Person("tim", 2),
                new Person("jim", 4),
                new Person("randy", 0),
                new Person("sandy", 5),
                new Person("andy", 8),
                new Person("katie", 6),
                new Person("laura", 2),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 8),
        };
        assertEquals("Get Out Now!", outed(meet, "john"));
    }
}
