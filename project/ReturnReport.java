package project;

public class ReturnReport {
	private String exName;
	private int score;
	private int fscore;
	private int count;
	private long start;
	private long end;

	public ReturnReport() {
	}

	public ReturnReport(String exName, int score, int fscore, long start, long end,int count) {
		this.exName = exName;
		this.score = score;
		this.fscore = fscore;
		this.start = start;
		this.end = end;
		this.count=count;
	}

	public void showReport() {
		System.out.println(exName + "\t\t  " +count+" \t"+ score + "\t " + fscore + "\t\t" + (end - start) / 1000 + "초");
	}

	public void showScore() {
		System.out.println(Exercise.score + "점 누적되었습니다.");
		if (Main.mscore >= 0) {
			System.out.println("누적 점수 : " + Exercise.fscore + "\r\n" + Main.mscore + "점 남았습니다.");
		} else {
			System.out.println("누적 점수 : " + Exercise.fscore);
		}
		if (Main.mscore == 0) {
			System.out.println("목표점수에 도달했습니다. 고생하셨습니다!");
		} else if (Main.mscore < 0) {
			System.out.println("목표점수를 초과했습니다! 고생하셨습니다!");
		}
	}
}