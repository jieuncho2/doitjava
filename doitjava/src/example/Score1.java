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
public class Score1 {

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
		
		if(avg>90) {
			grade = 'A';
		} else if(avg>80) {
			grade = 'B';
		} else if(avg>70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		System.out.println("��� ������ " + avg + "���̰� " +grade + "����Դϴ�");
	}

}
