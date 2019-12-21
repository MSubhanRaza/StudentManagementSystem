

package smsmoke;

import java.util.*;

public abstract class Person implements ICRUD{
    private String id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private Date dob;
    private String contactNo;
    private boolean isMale;
    
    public Person(){}
    
    public Person(String id,String fname,String lname,String add,String email,Date dob, String cntct,boolean isMale){
        this.id = id;
        this.firstName = fname;
        this.lastName = lname;
        this.address = add;
        this.email = email;
        this.dob = dob;
        this.contactNo = cntct;
        this.isMale = isMale;
    }
    
    public abstract void add();
    public abstract void update();
    public abstract void delete();
    public abstract void fetch();
    
}
