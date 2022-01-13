public class kyu7_greet_me {
    public static void main(String[] args) {
        System.out.println(greet("riley"));
    }

    public static String greet(String name){
        return "Hello " + name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase() + "!";
    }
}
