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
public class Score {

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
		System.out.println("평균 점수는 " + avg + "점입니다");
		
		if(avg>90) {
			System.out.println("A등급");
		} else if(avg>80) {
			System.out.println("B등급");
		} else if(avg>70) {
			System.out.println("C등급");
		} else {
			System.out.println("F등급");
		}
	}

}
