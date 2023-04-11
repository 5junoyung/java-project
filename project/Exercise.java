package project;

import java.util.Scanner;

public class Exercise {
	static int fscore;
	static int count;
	static int score;
	static int circuit=0; // 배열주소값 // 운동수행시마다 증가
	static long start = System.currentTimeMillis(); // 운동수행시간
	static long end;

	static ReturnReport rr=new ReturnReport();
	static ReturnReport arr[]=new ReturnReport[100];
	static Scanner sc = new Scanner(System.in);
	
	public static void showBack(){	

		boolean isEx = true;
		while (isEx) {
			System.out.println("			<등> \r\n" 
					+ "[1] 시티드로우  · · · · · · · · · · · · · · · · · ·   2점 \r\n"
					+ "[2] 랫풀다운  · · · · · · · · · · · · · · · · · · ·   4점\r\n"
					+ "[3] 데드리프트 · · · · · · · · · · · · · · · · · · ·  5점\r\n"
					+ "[4] 바벨로우 ·  · · · · · · ·  ·  · · · · · · · · ·   6점\r\n"
					+ "[5] 풀업 · · · · · ·  ·  · · · · · · · · · · · ·   6점\r\n"
					+ "---------------------------------------------------\r\n"
					+ "[1~5]운동선택    |    [0] 뒤로가기    |    [9] 메인메뉴\r\n");
			switch(sc.nextInt()) {
			case 0 :
				isEx=false;
				break;
			case 1 :
				System.out.print("시티드로우 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=2*count;
				fscore+=score;
				Main.mscore-=score;	
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("시티드로우",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 2 :
				System.out.print("랫풀다운 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=4*count;
				fscore+=score;
				Main.mscore-=score;		
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("랫풀다운",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 3 :
				System.out.print("데드리프트 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=5*count;
				fscore+=score;
				Main.mscore-=score;	
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("데드리프트",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 4 :
				System.out.print("바벨로우 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=6*count;
				fscore+=score;
				Main.mscore-=score;	
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("바벨로우",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 5 :
				System.out.print("풀업 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=6*count;
				fscore+=score;
				Main.mscore-=score;	
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("풀업",score,fscore,start,end,count);
				circuit++;		
				rr.showScore();
				break;
			case 9 :
				Main.main(null);
				isEx=false;
				break;
			}
		}
	}

	public static void showChest(){
		boolean isEx = true;
		while (isEx) {
			System.out.println("			<가슴> \r\n"
					+ "[1] 벤치프레스  · · · · · · · · · · · · · · · · · ·   2점 \r\n"
					+ "[2] 펙덱플라이  · · · · · · · · · · · · · · · · · ·   4점\r\n"
					+ "[3] 풀오버 · · · · · · · · · · · · · · · · · · ·  5점\r\n"
					+ "[4] 딥스 · · · · · · · · · · · · · · · · · · · · ·   6점\r\n"
					+ "[5] 푸쉬업 · · · · · ·  ·  · · · · · · · · · · · ·   6점\r\n"
					+ "---------------------------------------------------\r\n"
					+ "[1~5]운동선택    |    [0] 뒤로가기    |    [9] 메인메뉴\r\n");
			switch(sc.nextInt()) {
			case 0 :
				isEx=false;
				break;
			case 1 :
				System.out.print("벤치프레스 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=2*count;
				fscore+=score;
				Main.mscore-=score;	
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("벤치프레스",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 2 :
				System.out.print("펙덱플라이 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=4*count;
				fscore+=score;
				Main.mscore-=score;	
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("펙덱플라이",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 3 :
				System.out.print("풀오버 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=5*count;
				fscore+=score;
				Main.mscore-=score;	
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("풀오버",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 4 :
				System.out.print("딥스 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=6*count;
				fscore+=score;
				Main.mscore-=score;	
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("딥스",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 5 :
				System.out.print("푸쉬업 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=6*count;
				fscore+=score;
				Main.mscore-=score;		
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("푸쉬업",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 9 :
				Main.main(null);
				isEx=false;
				break;
			}
		}
	}

	public static void showShoulder(){
		boolean isEx = true;
		while (isEx) {
			System.out.println("			<어깨> \r\n"
					+ "[1] 전면레이즈  ·  · · · · · · · · · · · · · · ·   2점 \r\n"
					+ "[2] 측면레이즈  · · · · · · · · · · · · · · ·   4점\r\n"
					+ "[3] 슈러그 · · · · · · · · · · · · · · · · · ·  5점\r\n"
					+ "[4] 페이스풀 · · · ·  ·  · · · · · · · · ·   6점\r\n"
					+ "[5] 덤벨프레스  · · · ·  ·  · · · · · · · · · · · ·   6점\r\n"
					+ "---------------------------------------------------\r\n"
					+ "[1~5]운동선택    |    [0] 뒤로가기    |    [9] 메인메뉴\r\n");
			switch(sc.nextInt()) {
			case 0 :
				isEx=false;
				break;
			case 1 :
				System.out.print("전면레이즈 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=2*count;
				fscore+=score;
				Main.mscore-=score;		
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("전면레이즈",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 2 :
				System.out.print("측면레이즈 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=4*count;
				fscore+=score;
				Main.mscore-=score;		
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("측면레이즈",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 3 :
				System.out.print("슈러그 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=5*count;
				fscore+=score;
				Main.mscore-=score;		
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("슈러그",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 4 :
				System.out.print("페이스풀 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=6*count;
				fscore+=score;
				Main.mscore-=score;	
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("페이스풀",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 5 :
				System.out.print("덤벨프레스 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=6*count;
				fscore+=score;
				Main.mscore-=score;		
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("덤벨프레스",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 9 :
				Main.main(null);
				isEx=false;
				break;
			}
		}
	}

	public static void showLeg(){
		boolean isEx = true;
		while (isEx) {
			System.out.println("			<하체> \r\n"
					+ "[1] 스쿼트  · · ··· · · · · · · · · · · · · · · ·   2점 \r\n"
					+ "[2] 런지  · · ·· · · · · · · · · · · · · · · · ·   4점\r\n"
					+ "[3] 브릿지 · · · · · · · · · · · · · · · · · ·  5점\r\n"
					+ "[4] 레그컬 · ·  · · · · · ·  ·  · · · · · · · · ·   6점\r\n"
					+ "[5] 레그프레스 · · · ·  ·  · · · · · · · · · · · ·   6점\r\n"
					+ "---------------------------------------------------\r\n"
					+ "[1~5]운동선택    |    [0] 뒤로가기    |    [9] 메인메뉴\r\n");
			switch(sc.nextInt()) {
			case 0 :
				isEx=false;
				break;
			case 1 :
				System.out.print("스쿼트 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=2*count;
				fscore+=score;
				Main.mscore-=score;		
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("스쿼트",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 2 :
				System.out.print("런지 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=4*count;
				fscore+=score;
				Main.mscore-=score;	
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("런지",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 3 :
				System.out.print("브릿지 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=5*count;
				fscore+=score;
				Main.mscore-=score;	
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("브릿지",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 4 :
				System.out.print("레그컬 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=6*count;
				fscore+=score;
				Main.mscore-=score;		
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("레그컬",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 5 :
				System.out.print("레그프레스 몇세트 실행하셨습니까?(운동이 끝난 후 입력하세요) ");
				count=sc.nextInt();
				score=6*count;
				fscore+=score;
				Main.mscore-=score;		
				end=System.currentTimeMillis();
				arr[circuit]=new ReturnReport("레그프레스",score,fscore,start,end,count);
				circuit++;
				rr.showScore();
				break;
			case 9 :
				Main.main(null);
				isEx=false;
				break;
			}
		}
	}
}