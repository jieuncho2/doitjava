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
public class Score {

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
		System.out.println("��� ������ " + avg + "���Դϴ�");
		
		if(avg>90) {
			System.out.println("A���");
		} else if(avg>80) {
			System.out.println("B���");
		} else if(avg>70) {
			System.out.println("C���");
		} else {
			System.out.println("F���");
		}
	}

}
