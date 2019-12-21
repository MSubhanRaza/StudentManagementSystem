


package smsmoke;



public class Programe {
    private String programeID;
    private String programeName;
    private String description;
    private String baseRequired;    
    
    public Programe(String pID,String pName){
        this.programeID = pID;
        this.programeName = pName;
    }
    
    public Programe(String pID,String pName,String pBRequired){
        this.programeID = pID;
        this.programeName = pName;
        this.baseRequired = pBRequired;
    }
    
    public Programe(String pID,String pName,String pDesc,String pBRequired){
        this.programeID = pID;
        this.programeName = pName;
        this.description = pDesc;
        this.baseRequired = pBRequired;
    }
    
    public void setProgrameId(String id){
        this.programeID = id;
    }
    public String setProgrameId(){
        return programeID;
    }
    
    public void setProgrameName(String name){
        this.programeName = name;
    }
    public String getProgameName(){
        return programeName;
    }
    
   
  
    
    
    
    
    
}
