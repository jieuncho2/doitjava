package example;

import java.util.Scanner;

public class Exam19 {

	public static void main(String[] args) {
		//���� ������ ���ڸ� ����ϴ� ���α׷� �ۼ�
		//switch case ������ ���
		
		Scanner sc = new Scanner(System.in);
		
		int thisMonth = (int)(Math.random()*12)+1; 
		System.out.print("�� ��?");
		System.out.print(" > ");
		thisMonth = sc.nextInt();
		
		switch(thisMonth) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			System.out.println(thisMonth + "���� 31�ϱ����Դϴ�.");
			break;
		case 2:
			System.out.println(thisMonth + "���� 28�ϱ����Դϴ�.");
			break;
		default:
			System.out.println(thisMonth + "���� 30�ϱ����Դϴ�.");
		}
	}
}