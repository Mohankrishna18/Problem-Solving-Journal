package Day9;

class BankAccount{
     private String accountNumber;
    private double balance;

    BankAccount(String accountNumber,double balance){
    this.accountNumber = accountNumber;
    this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
        balance += amount;
            System.out.println("Amount deposited : "+ amount);
        } else{
            System.out.println("Amount must be greater than 0.");
        }

    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("with draw : "+ amount);
        }else{
            System.out.println("Insufficient balance or invalid amount");

        }
    }
    public double getBalance(){
        return balance;
    }

}
public class Problem1 {
   public static void main(String[] args){
    BankAccount ba = new BankAccount("Mohan123", 1000.0);
    ba.deposit(9494.9);
    ba.withdraw(2000.0);
    ba.withdraw(10000.0);

    System.out.println("Final Balance: " + ba.getBalance());
   }
}
