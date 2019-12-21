

package smsmoke;

import java.util.*;

public class Student extends Person  {
    
    private String fatherName;
    private String lastClassAttended;
    private int cYear;
    private char cGrade;
    private String diploma;
    private int dYear;
    private char dGrade;
    private String applyingFor;
    
    public Student(String id,String fname,String lname,String add,String email,Date dob, String cntct,boolean isMale,String fatname,String lstclass){
        super(id,fname,lname,add,email,dob,cntct,isMale);
        this.fatherName = fatname;
        this.lastClassAttended = lstclass;
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
        System.out.println(this);
    }
    
}
