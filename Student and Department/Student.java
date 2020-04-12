public class Student{
     private int sid;
     private String sname;
     private Department department;
     
     public int getSid(){
         return this.sid;
     }
     public String getSname(){
         return this.sname;
     }
     public Department getDepartment(){
         return this.department;
     }
     public void setSid(int a){
         this.sid=a;
     }
     public void setSname(String b){
         this.sname=b;
    }
    public void setDepartment(Department d){
        this.department=d;
    }
}