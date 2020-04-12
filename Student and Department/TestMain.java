import java.util.Scanner;
public class TestMain{
    public static void main (String[] args) {
        TestMain t=new TestMain();
        Student ss=t.createStudent();
        Department d=ss.getDepartment();
        
        System.out.println("Department id:"+d.getDid());
        System.out.println("Department name:"+d.getDname());
        System.out.println("Student id:"+ss.getSid());
        System.out.println("Student name:"+ss.getSname());
        
    }
    public static Student createStudent(){
        Scanner obj=new Scanner(System.in);
        Student s=new Student();
        Department d=new Department();
        int x,y;
        String a,b;
        System.out.println("Enter the Department id:");
        x=obj.nextInt();
        obj.nextLine();
        System.out.println("Enter the Department name:");
        a=obj.nextLine();
        d.setDid(x);
        d.setDname(a);
        System.out.println("Enter the Student id:");
        y=obj.nextInt();
        obj.nextLine();
        System.out.println("Enter the Student name:");
        b=obj.nextLine();
        s.setSid(y);
        s.setSname(b);
        s.setDepartment(d);
        return s;
    }
}