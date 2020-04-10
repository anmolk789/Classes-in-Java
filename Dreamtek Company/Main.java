import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        int h,l;
        String j;
        Scanner obj= new Scanner(System.in);
        Associate q= new Associate();
        System.out.println("Enter the associate id:");
        h=obj.nextInt();
        obj.nextLine();
        q.setAssociateId(h);
        System.out.println("Enter the associate name:");
        j=obj.nextLine();
        q.setAssociateName(j);
        System.out.println("Enter the number of days:");
        l=obj.nextInt();
        q.trackAssociateStatus(l);
        System.out.println("The associate "+q.getAssociateName()+" work status:"+q.getWorkStatus());
    }
    
}