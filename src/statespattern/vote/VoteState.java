package statespattern.vote;

public interface VoteState {
	/**
	 * 处理状态对应的行为
	* @Title: vote 
	* @Description: TODO 抽象状态类
	* @param @param user 投票人
	* @param @param voteItem 投票项
	* @param @param voteManager  投票上下文，用来在实现状态对应的功能处理的时候，可以回调上下文的数据 
	* @return void    返回类型 
	* @throws
	 */
	
	
	public void vote(String user , String voteItem , VoteManager voteManager);
}
