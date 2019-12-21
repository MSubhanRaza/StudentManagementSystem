

package smsmoke;


public class Course implements ICRUD {
    private String courseID;
    private String name;
    private String description;
    private String type;
    private String preRequsite;
    private int creditHours;
    
    public Course(String courseID,String name,String desc,String type,String preReq,int credithours){
        this.courseID = courseID;
        this.name = name;
        this.description = desc;
        this.type = type;
        this.preRequsite = preReq;
        this.creditHours = credithours;
    }
    
    @Override
    public void add(){
    }
    
        @Override
    public void update(){
    }
    
        @Override
    public void delete(){
    }
    
        @Override
    public void fetch(){
    }
    
}
