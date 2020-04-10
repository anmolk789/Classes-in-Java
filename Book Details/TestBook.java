import java.util.Scanner;
public class TestBook{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int a;
        String d,c;
        System.out.println("Enter the Book name:");
        d=obj.nextLine();
        System.out.println("Enter the price:");
        a=obj.nextInt();
        obj.nextLine();
        System.out.println("Enter the Author name:");
        c=obj.nextLine();
        Book b=new Book();
        b.setBookName(d);
        b.setBookPrice(a);
        b.setAuthorName(c);
        System.out.println("Book Details");
        System.out.println("Book Name :"+b.getBookName());
        System.out.println("Book Price :"+b.getBookPrice());
        System.out.println("Author Name :"+b.getAuthorName());
    }
}