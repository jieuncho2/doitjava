package example;

import java.util.Scanner;

public class Exam19 {

	public static void main(String[] args) {
		//달의 마지막 일자를 출력하는 프로그램 작성
		//switch case 구문을 사용
		
		Scanner sc = new Scanner(System.in);
		
		int thisMonth = (int)(Math.random()*12)+1; 
		System.out.print("몇 월?");
		System.out.print(" > ");
		thisMonth = sc.nextInt();
		
		switch(thisMonth) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			System.out.println(thisMonth + "월은 31일까지입니다.");
			break;
		case 2:
			System.out.println(thisMonth + "월은 28일까지입니다.");
			break;
		default:
			System.out.println(thisMonth + "월은 30일까지입니다.");
		}
	}
}