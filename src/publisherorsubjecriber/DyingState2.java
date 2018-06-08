package publisherorsubjecriber;

public class DyingState2 extends SaiyaState {

	  /**  
     * @param saiya  
     */  
    public DyingState2(Saiya saiya) {   
        super(saiya);
  
    }   
    /* 濒死状态被打进入女神守护状态 
     *   
     */  
  
    public void hit() {   
       saiya.setState( saiya.GODDESS);   
    }  
}
