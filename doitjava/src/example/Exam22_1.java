package example;

import java.util.Scanner;

public class Exam22_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int com = (int)(Math.random()*100)+1;
		int user = 0;
		int cnt = 0;
		
		System.out.println("숫자 맞추기 게임을 시작합니다.");
		System.out.println("1부터 100까지 숫자 중 생성된 숫자는 무엇일까요?");
		
		while(true) {
			System.out.print("> ");
			user = sc.nextInt();
			System.out.println(++cnt + "회 입력하셨습니다.");
			if(user>com) {
				System.out.println("입력하신 숫자보다 아래에 있습니다. down");
			} else if(user<com) {
				System.out.println("입력하신 숫자보다 위에 있습니다. up");
			} else {
				System.out.println("정답입니다. 게임을 종료합니다.");
				sc.close();
				break;
			}
		}
	}
}
//		while(true) {
//			com = (int)(Math.random()*100);
//			System.out.println("업다운 게임입니다.");
//			System.out.println("1부터 100까지 숫자 중 생성된 숫자는 무엇인가요?");
//			System.out.print("> ");
//			user = sc.nextInt();
//			
//			if(user==com) {
//				System.out.println("정답");
//			} else if(user<com) {
//				System.out.println("up");
//			} else if(user>com){
//				System.out.println("down");
//			} else {
//				System.out.println("오류");
//			}
//		}
//	}
//}
