package example;

import java.util.Scanner;

public class Game01 {
	public static void main(String[] args) {

		final int GA = 0;
		final int BA = 1;
		final int BO = 2;
		
		int user, com;
		Scanner sc = new Scanner(System.in);
		
		com = (int)(Math.random()*3);
		System.out.println("���������� �����Դϴ�.");
		System.out.println("0: ����, 1: ����, 2: ��");
		System.out.print("> ");
		user = sc.nextInt();
		
		if(user==0) {
			System.out.println("������ ���̽��ϴ�");
			if(com==2) {
				System.out.println("��ǻ��: ��");
				System.out.println("�̰���ϴ�");
			} else if(com==1) {
				System.out.println("��ǻ��: ����");
				System.out.println("�����ϴ�");
			} else {
				System.out.println("��ǻ��: ����");
				System.out.println("�����ϴ�");
			}
		} else if(user==1) {
			System.out.println("������ ���̽��ϴ�");
			if(com==1) {
				System.out.println("��ǻ��: ����");
				System.out.println("�����ϴ�");
			} else if(com==2) {
				System.out.println("��ǻ��: ��");
				System.out.println("�����ϴ�");
			} else {
				System.out.println("��ǻ��: ����");
				System.out.println("�̰���ϴ�");
			}
		} else if(user==2) {
			System.out.println("���� ���̽��ϴ�");
			if(com==0) {
				System.out.println("��ǻ��: ����");
				System.out.println("�̰���ϴ�");
			} else if(com==1) {
				System.out.println("��ǻ��: ����");
				System.out.println("�̰���ϴ�");
			} else {
				System.out.println("��ǻ��: ��");
				System.out.println("�����ϴ�");
				}
			}
		}
	}
