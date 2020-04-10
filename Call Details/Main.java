import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Call c=new Call();
        Scanner obj=new Scanner(System.in);
        String a;
        a=obj.nextLine();
        c.parseData(a);
        System.out.println("Call id:"+c.getCallId());
        System.out.println("Called number:"+c.getCalledNumber());
        System.out.println("Duration:"+c.getDuration());
    }
}

