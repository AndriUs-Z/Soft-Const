public class BankAccount {
    private String name;
    private double balance;
    private Date dateOpen;

    public BankAccount(String name){
        this.name = name;
        this.balance = 0.0;
        this.dateOpen = new Date(16, 7, 2024);
    }

    public BankAccount(String name,double amount,Date date){
        this.name = name;
        this.balance = amount;
        this.dateOpen = date;
    }

    public void deposit(double amount){
        if (amount > 0){
            this.balance =+ amount;
        } else {
            //
        }
    }

    public boolean withdraw(double amount){
        if(amount > 0 && this.balance >= amount){
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public void transfer(BankAccount other,double amount){
        if (this.withdraw(amount)) {
            other.deposit(amount);
        } else {
            System.out.println("Transfer Failed!");
        }
    }

    public String getInfo(){
        return "Account name : " + this.name + ",balance : " + balance + ",Date : " + dateOpen; 
    }

    public void show(){
        System.out.println("name : "+name);
        
        System.out.println("balance : "+balance);
        System.out.println("date : "+ dateOpen);
    }
}