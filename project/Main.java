package project;

import java.util.Scanner;

public class Main {
	public static int mscore = 100; 
	static boolean isMainMenu = true;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		while (isMainMenu) {
			System.out
			.println("		         헬린이 키우기 (•̀ᴗ•́)و\r\n" + "〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓\r\n"
					+"점수획득을 통해 목표점수까지 도달하여 헬스를 게임처럼 즐길 수 있게하는 프로그램입니다 \r\n"
					+"헬린이 여러분 환영합니다\r\n"
					+"(게임 시작전 BMI/표준체중 메뉴를 통해 목표점수를 확인하세요!)\r\n" 
					+ "헬린이키우기 시작하겠습니다!\r\n"+"\r\n\r\n"
					+ "<메뉴를 골라주세요>\r\n" 
					+ "〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓\r\n"
					+ "| [1] BMI/표준체중  |  [2] 운동하기  |  [3] 달성현황  |  [4] 종료하기  |\r\n"
					+ "〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			switch (sc.nextInt()) {
			case 1:
				BMI.showBMI();
				break;
			case 2:
				ExercisePage.showExercise();
				break;
			case 3:
				Achievement.showAchievement();
				break;
			case 4:
				Achievement.showEnd();
				ExercisePage.isExercise=false;
				isMainMenu = false;
				break;
			}
		}
	}
}