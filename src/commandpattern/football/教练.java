package commandpattern.football;

public class 教练 {
	
	private 老板的命令 bossCommand;

	public 教练(老板的命令 bossCommand) {
		this.bossCommand = bossCommand;
	}
	public void  getVictory(){
		bossCommand.victory();
	}
	public void  getFail(){
		bossCommand.fail();
	}
}
