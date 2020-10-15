public class Deposit {
    double calculate(double summ, double persent, int month) {
        if (month < 0) {
            return 0;
        }
        int coefficent = 12;

        double percentMonth = persent / coefficent;
        double profit = ((summ*percentMonth)/month)*month;

        return profit;
    }


}
