package example;

import java.util.Scanner;

public class Exam19_1 {

	public static void main(String[] args) {
		//���� ������ ���ڸ� ����ϴ� ���α׷� �ۼ�
		//switch case ������ ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ��?");
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
		System.out.println(thisMonth + "���� " + day + "�ϱ����Դϴ�.");
		sc.close();
	}
}