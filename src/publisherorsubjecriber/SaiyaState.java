package publisherorsubjecriber;

public abstract class SaiyaState {   
    protected Saiya saiya;   
  
    public SaiyaState(Saiya saiya) {   
        this.saiya = saiya;   
    }   
       
    public String status(){   
        String name=getClass().getName();   
        return name.substring(name.lastIndexOf(".")+1);   
    }   
    //星矢被打了   
    public abstract void hit();   
}  
