package Ex2;

public class DebitCard extends Card {

    private SavingAccount savingAccount;

    public DebitCard(String cardNum) {
        super(cardNum);
    }

    @Override
    public boolean withdraw(double amount) {
        
        return false;
    }

    @Override
    public String type() {
        return "visa";
    }

    @Override
    public double discount() {
        return 2.5;
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

}