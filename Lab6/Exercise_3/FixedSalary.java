public class FixedSalary extends Employee {
    private double monthlySalary;

    public FixedSalary(String first, String last, String ssn, double salary) {
        super(first, last, ssn);
        this.monthlySalary = salary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return String.format("Fixed salary employee: %s\nmonthly salary: $%.2f",
                super.toString(), monthlySalary);
    }
}