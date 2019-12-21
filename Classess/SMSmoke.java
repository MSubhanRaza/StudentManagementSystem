/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smsmoke;

import java.util.*;

public class SMSmoke {

    
    public static void main(String[] args) {
        Date dt = new Date(1,01,12);
        Student student = new Student("std-1001","Yasir","Ali","Korangi 5","yasir@gmail.com",dt,"0315-2369854",true,"Khursheed","2ndYear");
        
        student.fetch();
        
    }
    
}
