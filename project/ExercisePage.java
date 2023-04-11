package project;


import java.util.Scanner;

public class ExercisePage {
	static boolean isExercise = true;
	static Scanner sc = new Scanner(System.in);
	public static void showExercise(){
		
		while (isExercise) {
			System.out.println();
			System.out
					.println("		       헬린이 키우기 (•̀ᴗ•́)و\r\n" + "〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓\r\n"
							+ "		<<하고싶은 운동부위를 선택하세요>>\r\n\n" 
							+ "      [1] 등   [2] 가슴   [3] 어깨   [4] 하체   [5] 메인메뉴로\r\n\n");
			switch (sc.nextInt()) {
			case 1:
				Exercise.showBack();
				break;
			case 2:
				Exercise.showChest();
				break;
			case 3:
				Exercise.showShoulder();
				break;
			case 4:
				Exercise.showLeg();
				break;
			case 5 :
				Main.main(null);
				isExercise=false;
				break;
			}
		}
	}
}
