package project;


import java.util.Scanner;

public class BMI {
	
	public static void showBMI(){
		
		int score;
		int nWeight = 1;  
		boolean isBMI = true;
		
		while (isBMI) {
			System.out.println();
			System.out.println("		       헬린이 키우기 (•̀ᴗ•́)و\r\n" 
			+ "〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.println("성별, 키(cm), 몸무게(kg)를 입력하세요");
			Scanner sc = new Scanner(System.in);
				System.out.print("성별(남/여) : ");
				String type = sc.next();
				System.out.print("키(cm) : ");
				double height = sc.nextDouble();
				System.out.print("몸무게(kg) : ");
				double weight = sc.nextDouble();

				double bmi1 = weight / ((height / 100) * (height / 100));
				double bmi = Math.round(bmi1 * 100) / 100.0;

				System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
				System.out.println(type + " / " + height + "cm / " + weight + "kg 입니다.");
				System.out.println("당신의 BMI는 " + bmi +" "+type+"입니다.");
				switch (type) {
				case "여":
					if (height < 150) nWeight = 47;
					else if (height < 155) nWeight = 50;
					else if (height < 160) nWeight = 53;
					else if (height < 165) nWeight = 56;
					else if (height < 170) nWeight = 60;
					else if (height < 175) nWeight = 64;
					else if (height < 180) nWeight = 69;
					else if (height < 185) nWeight = 73;
					else nWeight = 80;
					break;
				case "남":
					if (height < 150) nWeight = 49;
					else if (height < 155) nWeight = 52;
					else if (height < 160) nWeight = 55;
					else if (height < 165) nWeight = 58;
					else if (height < 170) nWeight = 63;
					else if (height < 175) nWeight = 67;
					else if (height < 180) nWeight = 72;
					else if (height < 185) nWeight = 77;
					else nWeight =84;
					break;
				}
				System.out.println(
						height + "cm " + type + "성의 정상체중 범위는 " + (nWeight - 4) + "kg ~ " + (nWeight + 4) + "kg입니다.");
				if (bmi < 20) {
					score = 120;
					System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
					System.out.println("목표점수는 ** " + score + "점 ** 입니다.");
					Main.mscore=score;
				} else if (bmi < 22.9) {
					score = 100;
					System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
					System.out.println("목표점수는 ** " + score + "점 ** 입니다.");
					Main.mscore=score;
				} else if (bmi < 24) {
					score = 120;
					System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
					System.out.println("목표점수는 ** " + score + "점 ** 입니다.");
					Main.mscore=score;
				} else if (bmi < 28) {
					score = 130;
					System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
					System.out.println("목표점수는 ** " + score + "점 ** 입니다.");
					Main.mscore=score;
				} else {
					score = 140;
					System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
					System.out.println("목표점수는 ** " + score + "점 ** 입니다.");
					Main.mscore=score;
				}
				System.out.println();
				System.out.println("[D]운동시작하기  |  [B]뒤로가기  |  [A]다시입력하기");
				switch (sc.next()) {
				case "D" :
				case "d" :
					ExercisePage.showExercise();
					isBMI=false;
					break;
				case "B" :
				case "b" :
					isBMI=false;
					break;
				case "A" :
				case "a" :
					isBMI=true;
					break;
			}
		}
	}
}