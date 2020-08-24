package chapter04;

import java.util.Scanner;

public class Z106p {

	public static void main(String[] args) {
		int floor;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("정수를 입력해 주세요.");
		System.out.print("> ");
		
		floor = sc.nextInt();
		switch (floor) {
		case 1:
			System.out.println("1층 약국입니다.");
			break;
		case 2:
			System.out.println("2층 정형외과입니다.");
			break;
		case 3:
			System.out.println("3층 피부과입니다.");
			break;
		case 4:
			System.out.println("4층 치과입니다.");
			break;
		case 5:
			System.out.println("5층 헬스 클럽입니다.");
			break;
		default:
			System.out.println("잘못된 층수 입니다.");
		}
		sc.close();
	}

}
