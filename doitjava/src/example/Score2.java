package example;

import java.util.Scanner;

/*
 * 국어 영어 수학 점수를 입력받아서
 * 평균을 출력한 후
 * 100~91 a등급
 * 90~81 b등급
 * 80~71 c등급
 * 나머지는 f등급
 * 
 * 평균점수와 등급을 출력하세요
 */
public class Score2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력해 주세요: ");
		int k = sc.nextInt();
		System.out.print("영어 점수를 입력해 주세요: ");
		int e = sc.nextInt();
		System.out.print("수학 점수를 입력해 주세요: ");
		int m = sc.nextInt();
		
		int sum = k + e + m;
		double avg = sum/3.0;
		
		char grade = 0;
		
		switch((int)avg / 10) {
			case 10:
				
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			default:
				grade = 'F';
		}
		System.out.println("평균 점수는 " + avg + "점이고 " +grade + "등급입니다");
	}

}
