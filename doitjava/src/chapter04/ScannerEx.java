package chapter04;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		int iNum;
		Scanner sc = new Scanner(System.in); // 스캐너 생성 코드 - 변경 가능한 것은 변수명 뿐

		System.out.println("정수를 입력해 주세요.");
		System.out.print("> ");
		iNum = sc.nextInt();
		System.out.println("입력한 정수: " + iNum);
		System.out.println();
		System.out.println("실수를 입력해 주세요.");
		double dNum = sc.nextDouble();
		System.out.println("입력한 실수: " + dNum);
		System.out.println();
		System.out.println("실수(f)를 입력해 주세요.");
		float fNum = sc.nextFloat();
		System.out.println("입력한 실수(f): " + fNum);
		System.out.println();
		System.out.println("문자열을 입력해 주세요.");
		String str = sc.next();
		System.out.println("입력한 문자열: " + str);
		
		System.out.println("입력한 문자열: " + str);
		str =sc.next();

		String str1 = sc.nextLine(); // 한 줄 입력 명령어로 공백도 입력 가능합니다.
		System.out.println("입력한 문자열: " + str1);
		
		sc.close(); // 스캐너는 더 이상 사용하지 않는다면 닫아 줘야 합니다.

	}

}
