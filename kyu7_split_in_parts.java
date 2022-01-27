import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class kyu7_split_in_parts {

    public static String splitInParts(String s, int partLength) {
        return IntStream.range(0, s.length()/partLength).mapToObj(v->s.substring(v*partLength, v*partLength+partLength)).collect(Collectors.joining(" ")) + (s.length()%partLength>0?" "+s.substring(s.length()-s.length()%partLength):"");
    }

    public static void main(String[] args) {
        System.out.println(splitInParts("supercalifragilisticexpialidocious", 1));
    }
}
