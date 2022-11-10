/*
interface IBank{
    public void deposit(int fund);
    public boolean withdraw(int fund);
    public int getBalance();
    public  int getAccountNumber();
}
*/

//implement interface here

class Bank implements IBank {
    int balance;
    String name;
    int accountNumber;

    Bank(int balance, String name, int accountNumber) {
        this.balance = balance;
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public void deposit(int fund) {
        this.balance += fund;
    }
    public boolean withdraw(int fund) {
        if(this.balance < fund) {
            return false;
        }else {
            this.balance -= fund;
        }
        return true;
    }
    public int getBalance() {
        return this.balance;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }

}
