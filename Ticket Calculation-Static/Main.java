import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        int a,b,c,d,e,f;
        Ticket t=new Ticket();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no of bookings:");
        a=obj.nextInt();
        System.out.println("Enter the available tickets:");
        b=obj.nextInt();
        t.setAvailableTickets(b);
        for (int i=0;i<a;i++){
            System.out.println("Enter the ticketid:");
            c=obj.nextInt();
            t.setTicketid(c);
            System.out.println("Enter the price:");
            d=obj.nextInt();
            t.setPrice(d);
            System.out.println("Enter the no of tickets:");
            e=obj.nextInt();
         int g= t.getAvailableTickets();
            System.out.println();
            f=t.calculateTicketCost(e);
            if(f==-1){
                System.out.println("Tickets not sufficient/ available");
                return;
            }
            System.out.println("Available tickets: "+g);
            System.out.println();
            System.out.println("Total amount:"+f);
            System.out.println();
            System.out.println("Available ticket after booking:"+t.getAvailableTickets());
            System.out.println();
            
        }
        
    }
}