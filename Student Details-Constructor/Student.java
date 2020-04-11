public class Student{
    private int studentId;
    private String studentName,studentAddress,collegeName;
    
    public Student(int a,String b,String c){
        this.studentId=a;
        this.studentName=b;
        this.studentAddress=c;
        this.collegeName="NIT";
    }
    
    public Student(int a,String b,String c,String d){
        this.studentId=a;
        this.studentName=b;
        this.studentAddress=c;
        this.collegeName=d;
    }
    public int getStudentId(){
        return this.studentId;
    }
    public String getStudentName(){
        return this.studentName;
    }
    public String getStudentAddress(){
        return this.studentAddress;             
    }
    public String getCollegeName(){
        return this.collegeName;
    }
}