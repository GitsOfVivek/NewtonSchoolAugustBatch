// your code goes here
class BankAccount{
    int balance;
    String name;
    BankAccount(int balance,String name){
        this.balance=balance;
        this.name=name;
    }
    public void depositFund(int fund){
        balance+=fund;
    }
    public boolean withdrawFund(int withdraw){
        if(withdraw>balance) return false;
        else {
            balance-=withdraw;
            return true;
        }
    }
}
