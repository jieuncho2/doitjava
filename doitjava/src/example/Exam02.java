package example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
		
		if(num%2==0) System.out.println("짝수2");
		else System.out.println("홀수2");
		
		System.out.println(num%2==0 ? "짝수3":"홀수3");
		
		sc.close();
	}

}
