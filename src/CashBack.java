public class CashBack {

    int calculate(int amount) {
        if (amount < 3000_00) {
            return 0;
        }
        int total = amount/(3*100);
        return total;

    }
}


