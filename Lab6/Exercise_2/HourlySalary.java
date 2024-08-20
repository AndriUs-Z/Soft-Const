public class HourlySalary extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlySalary(String first, String last, String ssn, double rate, double hours) {
        super(first, last, ssn);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    @Override
    public double earnings() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s\nhourly pay: $%.2f; hours worked: %.2f",
                super.toString(), hourlyRate, hoursWorked);
    }
}