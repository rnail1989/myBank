import bankService.BankService;

public class Main {
    public static void main(String[] args) {
        BankService bank = new BankService();
        double profitDeposit = bank.calculateDeposit(3000,12,10);
        System.out.println(profitDeposit);
        double profitCashback = bank.calculateCashback(4500);
        System.out.println(profitCashback);





    }
}
