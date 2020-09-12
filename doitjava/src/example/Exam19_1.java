package example;

import java.util.Scanner;

public class Exam19_1 {

	public static void main(String[] args) {
		//달의 마지막 일자를 출력하는 프로그램 작성
		//switch case 구문을 사용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 월?");
		System.out.print(" > ");
		int thisMonth = sc.nextInt();
		int day=0;
		
		switch(thisMonth) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		default:
			day = 30;
		}
		System.out.println(thisMonth + "월은 " + day + "일까지입니다.");
		sc.close();
	}
}