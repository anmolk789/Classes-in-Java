public class Ticket{
    private int ticketid,price;
    private static int availableTickets;
    
    public Ticket(){}
    
    public void setTicketid(int a){
        this.ticketid=a;
    }
    public void setPrice(int b){
        this.price=b;
    }
    public static void setAvailableTickets(int c){
        if(c>0){
            availableTickets=c;
        }
    }
    public int getTicketid(){
        return this.ticketid;
    }
    public int getPrice(){
        return this.price;
    }
    public static int getAvailableTickets(){
        return availableTickets;
    }
    public int calculateTicketCost(int nooftickets){
        if(getAvailableTickets()<nooftickets)
            return -1;
            this.availableTickets=this.availableTickets-nooftickets;
            return nooftickets*getPrice();
        }
    }
