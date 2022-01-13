public class kyu7_automorphic_number {
    public static String autoMorphic(int number)
    {
        String s1 = ""+number;
        String s2 = ""+number*number;
        return s2.endsWith(s1)?"Automorphic":"Not!!";
    }

    public static void main(String[] args) {
        System.out.println(autoMorphic(1));
        System.out.println(autoMorphic(3));
        System.out.println(autoMorphic(6));
        System.out.println(autoMorphic(9));
        System.out.println(autoMorphic(625));

    }
}
