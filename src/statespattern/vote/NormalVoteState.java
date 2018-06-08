package statespattern.vote;
/**具体状态类——正常投票*/
public class NormalVoteState implements VoteState {
	
	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//正常投票记录到投票记录中
		voteManager.getMapVote().put(user,voteItem);
		System.out.println("投票成功！");
	}

}
