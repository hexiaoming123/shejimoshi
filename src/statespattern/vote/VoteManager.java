package statespattern.vote;

import java.util.HashMap;
import java.util.Map;
/**
 * 考虑一个在线投票系统的应用，要实现控制同一个用户只能投一票，如果一个用户反复投票，
	 * 而且投票次数超过5次，则判定为恶意刷票，要取消该用户投票的资格，当然同时也要取消他所投的票；
	 * 如果一个用户的投票次数超过8次，将进入黑名单，禁止再登录和使用系统。
* @ClassName: VoteManager 
* @Description: TODO(环境类) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年5月30日 下午5:13:10 
*
 */
public class VoteManager {
	//持有状态处理对象
	private VoteState state = null;
	//记录用户投票结果，Map<String,String>对应Map<用户名称，投票选项>
	private Map<String, String> mapVote = new HashMap<String, String>();
	//记录用户投票次数，Map<String,Integer>对应Map<用户名称，投票次数>
	private Map<String, Integer> mapVoteCount = new HashMap<String, Integer>();
	/**
	 * 
	* @Title: getMapVote 
	* @Description: TODO() 
	* @param @return     
	* @return Map<String,String>    获取用户投票结果 
	* @throws
	 */
	public Map<String, String> getMapVote() {
		return mapVote;
	}
	public void vote(String user,String voteItem){
		//1.为该用户增加投票次数
		//从记录中取出改用户已有的投票次数
		Integer oldVoteCount = mapVoteCount.get(user);
		if (oldVoteCount == null) {
			oldVoteCount = 0;
		}
		oldVoteCount +=1;
		mapVoteCount.put(user, oldVoteCount);
		//2.判断该用户的投票类型，就相当于判断对应的状态
		//到底是正常投票、重复投票、恶意投票还是上黑名单的投票
		if (oldVoteCount == 1) {
			state = new NormalVoteState();
		}else if (oldVoteCount>1 &&oldVoteCount<=5) {
			state = new RepeatVoteState();
		}else if(oldVoteCount > 5 && oldVoteCount <=8){
            state = new SpiteVoteState();
        } else if(oldVoteCount > 8){
            state = new BlackVoteState();
        }
		  	//然后转调状态对象来进行相应的操作
			state.vote(user, voteItem, this);
	}

}
