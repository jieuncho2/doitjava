package example;

import java.util.Scanner;

public class Exam22 {

	public static void main(String[] args) {
		int user, com;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			com = (int)(Math.random()*100);
			System.out.println("업다운 게임입니다.");
			System.out.println("1부터 100까지 숫자 중 생성된 숫자는 무엇인가요?");
			System.out.print("> ");
			user = sc.nextInt();
			
			if(user==com) {
				System.out.println("정답");
			} else if(user<com) {
				System.out.println("up");
			} else if(user>com){
				System.out.println("down");
			} else {
				System.out.println("오류");
			}
		}
	}
}
