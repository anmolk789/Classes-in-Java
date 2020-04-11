import java.util.Scanner;
public class AccountDetails{
    public static void main (String[] args) {
        Account a;
        AccountDetails a1=new AccountDetails();
        a=a1.getAccountDetails();
        int am=a1.getWithdrawAmount();
        a.withdraw(am);
    }
    public int getWithdrawAmount(){
        int set=0,am=0;
        Scanner obj=new Scanner(System.in);
        while(set!=1){
            System.out.println("Enter amount to be withdrawn:");
            am=obj.nextInt();
            if(am>0)
            return am;
            System.out.println("Amount should be positive");
        }
        return am;
    }
     public Account getAccountDetails(){
     Account a=new Account();
     Scanner obj=new Scanner(System.in);
     int x,z;
     String y;
     System.out.println("Enter account id:");
     x=obj.nextInt();
     obj.nextLine();
     System.out.println("Enter account type:");
     y=obj.nextLine();
     a.setAccountId(x);
     a.setAccountType(y);
     int flag=0;
     
     while(flag!=1){
         System.out.println("Enter balance:");
         z=obj.nextInt();
         if(z>0){
             flag=1;
             a.setBalance(z);
             break;
         }
         System.out.println("Balance should be positive");
     }
     return a;
    }
}