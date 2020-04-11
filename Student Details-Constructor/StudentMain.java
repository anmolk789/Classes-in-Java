import java.util.Scanner;
public class StudentMain{
    public static void main (String[] args) {
        int x;
        String y,z,a,f;
        int flag=0,flag1=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        x=obj.nextInt();
        obj.nextLine();
        System.out.println("Enter Student's Name:");
        y=obj.nextLine();
        System.out.println("Enter Student's address:");
        z=obj.nextLine();
        Student s;
        while(flag!=1){
        System.out.println("Whether the student is from NIT(Yes/No):");
        a=obj.next();
        if(a.equals("Yes") ||a.equals("yes") || a.equals("YES")){
            flag=1;
            flag1=1;
            break;
        } 
        if(a.equals("No")|| a.equals("no") || a.equals("NO")){
            flag1=1;
            break;
            
        }
        System.out.println("Wrong Input");
        }
        if(flag==1){
            s=new Student(x,y,z);
        }else{
            System.out.println("Enter the college name:");
            f=obj.next();
            s=new Student(x,y,z,f);
        }
    System.out.println("Student id:"+s.getStudentId());
    System.out.println("Student name:"+s.getStudentName());
    System.out.println("Address:"+s.getStudentAddress());
    System.out.println("College Name:"+s.getCollegeName());
}}