package Ex2;

public class SavingAccount extends BaseAccount {

    private Card card;
    private FixedSalary employee;
    public Card getCard;
    private double balance;

    public SavingAccount(FixedSalary employee) {
        this.employee = employee;
        employee.setSavingAccount(this);
        DebitCard b = new DebitCard("xxx-xxx-5555");
        card = b;
        b.setSavingAccount(this);
    }
    public Card getCard() {
        return card;
    }

    @Override
    public boolean withdraw(double amount) {
        if(balance - amount > 0){
            this.balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean deposit(double amount) {
        if(amount > 0){
            this.balance += amount;
            return true;
        }
        return false;
    }
    public double getBalance() {
        return balance;
    }

}