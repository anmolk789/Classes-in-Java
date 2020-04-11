import java.util.Scanner;
public class StudentMain{
    public static void main (String[] args) {
     Student s1=getStudentDetails();
     s1.calculateAvg();
     s1.findGrade();
     System.out.println("Id:"+s1.getId());
     System.out.println("Name:"+s1.getName());
     System.out.println("Average:"+String.format("%.2f",s1.getAverage()));
     System.out.println("Grade:"+s1.getGrade());
    }
    public static Student getStudentDetails(){
        int q,w=0;
        String e;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the id:");
        q=obj.nextInt();
        obj.nextLine();
        System.out.println("Enter the name:");
        e=obj.nextLine();
        int flag=0;
        while(flag!=1){
            System.out.println("Enter the no of subjects:");
            w=obj.nextInt();
            if(w<=0){
                System.out.println("Invalid number of subjects");
                continue;
            }else 
            flag=1;
        }
        
        int[] m=new int[w];
        for(int i=0;i<w;i++){
            while(true){
                System.out.println("Enter  mark for subject "+(i+1)+":");
                m[i]=obj.nextInt();
                if(m[i]>=0 && m[i]<=100){
                    break;
                }else{
                    System.out.println("Invalid Mark");
                    continue;
                }
            }
        }
        Student s=new Student(q,e,m);
        return s;
    }
}
