import java.text.NumberFormat;

public class MortgageReport {
    final private byte MONTHS_IN_YEAR = 12;

    int principal;
    float annualInterest;
    byte years;

    public MortgageReport(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public void printMortgage() {
        var mortgage = new CalculateMortgage(principal, annualInterest, years);
        double finalMortgage = mortgage.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(finalMortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        var balance = new CalculateMortgage(principal, annualInterest, years);
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double finalBalance = balance.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(finalBalance));
        }
    }
}