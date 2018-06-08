package publisherorsubjecriber;

public class DyingState extends SaiyaState {

	  /**  
     * @param saiya  
     */  
    public DyingState(Saiya saiya) {   
        super(saiya);
  
    }   
  
    /* 濒死状态被打进入小宇宙爆发状态
     *   
     */  
  
    public void hit() {   
    	      saiya.setState( saiya.UNIVERSE);   
    }  

}
