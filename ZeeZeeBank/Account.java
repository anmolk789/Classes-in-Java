public class Account{
    private long accountNumber;
    private double balanceAmount;
    
    public double getBalanceAmount(){
        return this.balanceAmount;
    }
    
    public Account(long accountNumber,double balanceAmount){
        this.accountNumber=accountNumber;
        this.balanceAmount=balanceAmount;
    }
    
    public void deposit(double a){
        balanceAmount=getBalanceAmount()+a;
    }
    
    public int withdraw(double b){
        int d=0;
        if(b>getBalanceAmount()){
             d=-1;
        }else if(getBalanceAmount()>b){
            balanceAmount=getBalanceAmount()-b;
            d=1;
        }
        return d; 
    }
}