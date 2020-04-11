public class Student{
    private int id;
    private String name;
    private float average;
    private char grade;
    private int marks[];
    
    public Student(int a,String b,int[] c){
        this.id=a;
        this.name=b;
        this.marks=c;
    }
    public void calculateAvg(){
        average=0;
        for(int i=0;i<marks.length;i++){
            average=average+marks[i];
        }average=average/marks.length;
        setAverage(average);
    }
    public void findGrade(){
        int v=0;
        int []a=getMarks();
        for(int i=0;i<a.length;i++){
            if(a[i]<50){
                setGrade('F');
                v=1;
            }
        }
        if(v==0){
            if(getAverage()<=100 && getAverage()>=80){
                setGrade('O');
            }
            else
            setGrade('A');
        }
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public float getAverage(){
        return this.average;
    }
    public char getGrade(){
        return this.grade;
    }
    public int[] getMarks(){
        return this.marks;
    }
    public void setGrade(char k){
        this.grade=k;
    }
    public void setMarks(int[] m){
        this.marks=m;
    }
    public void setId(int x){
        this.id=x;
    }
    public void setName(String y){
        this.name=y;
    }
    public void setAverage(float z){
        this.average=z;
    }
}