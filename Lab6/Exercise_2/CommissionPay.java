public class CommissionPay extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionPay(String first, String last, String ssn, double sales, double rate) {
        super(first, last, ssn);
        this.grossSales = sales;
        this.commissionRate = rate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("commission employee: %s\ngross sales: $%.2f; commission rate: %.2f",
                super.toString(), grossSales, commissionRate);
    }
}