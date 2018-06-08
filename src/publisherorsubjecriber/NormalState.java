package publisherorsubjecriber;

public class NormalState extends SaiyaState {

	  /**  
     * @param saiya  
     */  
    public NormalState(Saiya saiya) {   
        super(saiya);
  
    }   
  
    /* 正常状态被打进入瀕死状态  
     *   
     */  
  
    public void hit() {   
        saiya.setState( saiya.DYING);   
  
    }  
}
