public class kyu7_fixme_get_full_name {
    static String firstName = "Clint";
    static String lastName = "";
    public static String getFullName() {

        return (firstName + lastName).trim();
    }

    public static void main(String[] args) {
        getFullName();
    }
}
