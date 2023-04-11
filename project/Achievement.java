package project;

import java.util.Scanner;

public class Achievement {
	public static void showAchievement(){
		boolean isAch=true;
		Scanner sc = new Scanner(System.in); 
			while(isAch) {
			System.out.println("                      <<달성현황>>\r\n"
					+"￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣\r\n"
					+"     운동이름     | 세트수 |  점수  |   누적점수   |   총 운동수행시간\r\n"	
					+"￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣");	
			for(int i=0;i<Exercise.circuit;i++) {
				Exercise.arr[i].showReport(); 
				// Circuit(운동수행횟수)값에 따라 배열에 저장하여 
				// showReport()메서드를 통해 출력
				
			}
			System.out.println();
			System.out.println("		     [M]메인메뉴로");
			switch(sc.next()) {
			case "M" :
			case "m" :
				isAch=false;
				break;
				
			}
		}
	}
	public static void showEnd() {
		System.out.println("고생하셨습니다. 프로그램이 종료됩니다.");
	}
}
