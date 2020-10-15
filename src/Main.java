public class Main {
    public static void main(String[] args) {
        CashBack cashBack = new CashBack();
        int result = cashBack.calculate(3000);
        Deposit deposit = new Deposit();
        double profit = deposit.calculate(10000,12,12);

        System.out.println(profit);
        System.out.println(cashBack);
    }
}
