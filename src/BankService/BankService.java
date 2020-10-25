package BankService;

public class BankService {

    public double calculateDeposit(double summ, double persent, int month) {
        if (month <= 0) {
            return 0.0;
        }
        int coefficent = 12;

        double percentMonth = (persent / coefficent)/100;
        double profit = ((percentMonth*month)*summ) ;
        return profit;

    }
    public double calculateCashback(int amount) {
        if (amount < 3000_00) {
            return 0;
        }
        int total = amount / (3 * 100);
        return total;
    }



}
