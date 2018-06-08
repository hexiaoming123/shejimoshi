package commandpattern.football;

public class 老板 {

	public static void main(String[] args) {
		
		球员 team = new 球员();
		老板的命令 bossCommand = new 命令内容(team);
		教练 drillmaster =new 教练(bossCommand);
		 drillmaster.getVictory();
		 System.out.println("-------");
		 drillmaster.getFail();
	}
}
