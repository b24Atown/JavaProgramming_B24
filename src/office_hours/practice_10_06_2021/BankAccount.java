package office_hours.practice_10_06_2021;

public class BankAccount {

    String fullName;
    double balance;
    long accountNumber;
    String accountType;

    public BankAccount(String fullName, double balance, long accountNumber, String accountType){
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public double checkBalance(long accountNumber){
        this.accountNumber=accountNumber;
        return balance;
    }

    public double deposit(double money){
        balance+=money;
        return balance;
    }

    public double withdraw(double money){
        if(money<=balance && money>0){
            return balance-=money;
        }
        return balance;
    }

    public String toString (){
        return "Bank Account: Full name " + fullName + " balance " + balance + " account number " + accountNumber + " account type " + accountType;

    }

}
