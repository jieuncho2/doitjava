package example;

import java.util.Scanner;

/*
 * ���� ���� ���� ������ �Է¹޾Ƽ�
 * ����� ����� ��
 * 100~91 a���
 * 90~81 b���
 * 80~71 c���
 * �������� f���
 * 
 * ��������� ����� ����ϼ���
 */
public class Score2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է��� �ּ���: ");
		int k = sc.nextInt();
		System.out.print("���� ������ �Է��� �ּ���: ");
		int e = sc.nextInt();
		System.out.print("���� ������ �Է��� �ּ���: ");
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
		System.out.println("��� ������ " + avg + "���̰� " +grade + "����Դϴ�");
	}

}
