package chapter04;

import java.util.Scanner;

/*
 * ���ڸ� �Է� �޾Ƽ� �Է¹��� ���ڰ� Ȧ������ ¦������ ����ϼ���.
 */

public class EvenOdd {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("������ �Է��� �ּ���.");
		System.out.print("> ");
		num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("�Է��� ���ڴ� ¦���Դϴ�.");
		} else {
			System.out.println("�Է��� ���ڴ� Ȧ���Դϴ�.");
		}
		sc.close();

	}

}
