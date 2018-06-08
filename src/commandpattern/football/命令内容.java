package commandpattern.football;

public class 命令内容  implements 老板的命令{
	
	球员 team;

	public 命令内容(球员 team) {
		this.team = team;
	}
	//赢球的方法
	public void victory(){
		team.run();
		team.shot();
		team.hoo();
	}
	//赢球的方法
		public void fail(){
			team.Norun();
			team.Noshot();
		}
	
}
