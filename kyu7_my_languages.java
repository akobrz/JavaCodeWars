import java.util.*;
import java.util.stream.Collectors;

import static junit.framework.TestCase.assertEquals;

public class kyu7_my_languages {

    public static List<String> myLanguages(final Map<String, Integer> results) {
        return results.entrySet().stream().filter(e->e.getValue()>=60).sorted((k1,k2)->-k1.getValue().compareTo(k2.getValue())).map(Map.Entry::getKey).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        final Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 10);
        map1.put("Ruby", 80);
        map1.put("Python", 65);
        assertEquals(Arrays.asList("Ruby", "Python"), myLanguages(map1));
        final Map<String, Integer> map2 = new HashMap<>();
        map2.put("Hindi", 60);
        map2.put("Dutch", 93);
        map2.put("Greek", 71);
        assertEquals(Arrays.asList("Dutch", "Greek", "Hindi"), myLanguages(map2));
        final Map<String, Integer> map3 = new HashMap<>();
        map3.put("C++", 50);
        map3.put("ASM", 10);
        map3.put("Haskell", 20);
        assertEquals(Collections.emptyList(), myLanguages(map3));
    }
}
