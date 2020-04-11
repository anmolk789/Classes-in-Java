public class Account{
    private int accountId;
    private int balance;
    private String accountType;
    
    public int getAccountId(){
        return this.accountId;
    }
    public int getBalance(){
        return this.balance;
    }
    public String getAccountType(){
        return this.accountType;
    }
    public boolean withdraw(int a){
        if(getBalance()<a){
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
        this.balance=this.balance-a;
        System.out.println("Balance amount after withdraw: "+this.balance);
        return true;
    }
    public void setAccountId(int b){
        this.accountId=b;
    }
    public void setBalance(int c){
        this.balance=c;
    }
    public void setAccountType(String d){
        this.accountType=d;
    }
}