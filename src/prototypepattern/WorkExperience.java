package prototypepattern;

import java.io.Serializable;

/** 
 * 工作经历类 
 * 
 */  
public class WorkExperience implements Serializable {         
    private static final long serialVersionUID = -5461562344310808271L;  
    private String workDate;  
    public String getWorkDate() {  
        return workDate;  
    }  
    public void setWorkDate(String workDate) {  
        this.workDate = workDate;  
    }  
      
    private String company;  
    public String getCompany() {  
        return company;  
    }  
    public void setCompany(String company) {  
        this.company = company;  
    }  
}  
