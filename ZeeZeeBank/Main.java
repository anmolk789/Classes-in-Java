import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        long a,c;
        double b;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the account number:");
        a=obj.nextLong();
        System.out.println("Enter the available amount in the account:");
        b=obj.nextDouble();
        Account aa= new Account(a,b);
        System.out.println("Enter the amount to be deposited:");
        c=obj.nextLong();
        aa.deposit(c);
        System.out.println("Available balance is:"+String.format("%.2f",aa.getBalanceAmount()));
        System.out.println("Enter the amount to be withdrawn:");
        long d=obj.nextLong();
        int f=aa.withdraw(d);
        if(f==-1)
            System.out.println("Insufficient balance");
        System.out.println("Available balance is:"+String.format("%.2f",aa.getBalanceAmount()));
        
    }
}