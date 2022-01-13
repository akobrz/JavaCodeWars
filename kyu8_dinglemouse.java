public class kyu8_dinglemouse {

    private static int ONE_HUNDRED = 100;

    public static final kyu8_dinglemouse INST = new kyu8_dinglemouse();

    private static int value;

    private kyu8_dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

}