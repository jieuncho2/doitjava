package chapter04;

import java.util.Scanner;

public class Z106p {

	public static void main(String[] args) {
		int floor;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("������ �Է��� �ּ���.");
		System.out.print("> ");
		
		floor = sc.nextInt();
		switch (floor) {
		case 1:
			System.out.println("1�� �౹�Դϴ�.");
			break;
		case 2:
			System.out.println("2�� �����ܰ��Դϴ�.");
			break;
		case 3:
			System.out.println("3�� �Ǻΰ��Դϴ�.");
			break;
		case 4:
			System.out.println("4�� ġ���Դϴ�.");
			break;
		case 5:
			System.out.println("5�� �ｺ Ŭ���Դϴ�.");
			break;
		default:
			System.out.println("�߸��� ���� �Դϴ�.");
		}
		sc.close();
	}

}
