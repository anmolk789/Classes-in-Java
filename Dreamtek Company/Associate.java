public class Associate{
    private int associateId;
    private String associateName,workStatus;
    
    public Associate(){
    }
    
    public void trackAssociateStatus(int d){
        if(d>0 && d<=20){
            setWorkStatus("Core skills");
        }else if(d>20 && d<=40)
        { setWorkStatus("Advanced modules");
        }
        else if(d>40 && d<=60){
            setWorkStatus("Project phase");
        }else if(d>60){
            setWorkStatus("Deployed in project");
        }
        else{}
    }
    
    public int getAssociateId(){
        return this.associateId;
    }
    
    public String getAssociateName(){
        return this.associateName;
    }
    
    public String getWorkStatus(){
        return this.workStatus;
    }
    
    public void setAssociateId(int a){
        this.associateId=a;
    }
    public void setAssociateName(String b){
        this.associateName=b;
    }
    public void setWorkStatus(String c){
        this.workStatus=c;
    }
    
}