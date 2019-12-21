
package smsmoke;

import java.util.*;


public class Teacher extends Person {
    private String lastExperience;
    private float duration;
    private double currentSalary;
    private Date dateOFJoining;
    private String designation;
    private boolean isMarried;
    
    public Teacher(String id,String fname,String lname,String add,String email,Date dob, String cntct,boolean isMale,String lastExp,
            float duration,double cSalary,Date dateOfJoining,String designation,boolean isMarried){
        super(id,fname,lname,add,email,dob,cntct,isMale);
        this.lastExperience = lastExp;
        this.duration = duration;
        this.currentSalary = cSalary;
        this.dateOFJoining = dateOfJoining;
        this.designation = designation;
        this.isMarried = isMarried;
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
