import java.util.*;
import java.util.stream.*;


public class kyu8_sortList {

    static class Sorter {
        public List<String> sort(List<String> textbooks) {
            textbooks.sort(String::compareToIgnoreCase);
            return textbooks;
        }

        public int[] mergeArrays(int[] first, int[] second){
            return IntStream.concat(IntStream.of(first), IntStream.of(second)).sorted().toArray();
        }

    }



    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        System.out.println(sorter.mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }));
        System.out.println(sorter.mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 }));
    }
}
