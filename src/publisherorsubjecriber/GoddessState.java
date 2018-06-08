package publisherorsubjecriber;


public class GoddessState extends SaiyaState {

	  /**  
     * @param saiya  
     */  
    public GoddessState(Saiya saiya) {   
        super(saiya);
  
    }   
  
    /* 女神守护状态被打进入正常状态  
     *   
     */  
  
    public void hit() {   
        saiya.setState( saiya.NORMAL);   
        
    }  
}
