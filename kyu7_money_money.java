public class kyu7_money_money {

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        double money = principal;
        int years = 0;
        while ( money < desired ) {
            money += (money*interest)*(1-tax);
            years++;
        }
        return years;
    }


    public static void main(String[] args) {
        System.out.println(calculateYears(1000,0.05,0.18,1100));
        System.out.println(calculateYears(1000,0.01625,0.18,1200));
        System.out.println(calculateYears(1000,0.05,0.18,1000));
    }
}
