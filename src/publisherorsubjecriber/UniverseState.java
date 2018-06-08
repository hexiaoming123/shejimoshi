package publisherorsubjecriber;

public class UniverseState extends SaiyaState {   
	  
    /**  
     * @param saiya  
     */  
    public UniverseState(Saiya saiya) {   
        super(saiya);   
  
    }   
  
    /* 小宇宙爆发状态被打进入濒死状态  
     *   
     */  
  
    public void hit() {   
     saiya.setState( saiya.DYING2);   
    }   
  
}  
