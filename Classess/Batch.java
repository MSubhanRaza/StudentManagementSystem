

package smsmoke;

import java.util.*;

public class Batch {
    private String batchID;
    private String batchName;
    private String description;
    private int batchYear;
    private Date startingDate;
    private Date endingDate;
    private int capacity;
    
    
    public Batch(String bID,String bName,String pDesc,int pYear,Date sDate, Date eDate,int cap){
        this.batchID = bID;
        this.batchName = bName;
        this.description = pDesc;
        this.batchYear = pYear;
        this.startingDate = sDate;
        this.endingDate = eDate;
        this.capacity = cap;
    }
    
    
}
