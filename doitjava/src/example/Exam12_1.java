package example;

import java.util.Scanner;

public class Exam12_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����ұ��?: ");
		int line = sc.nextInt();
		for(int i=0; i<line; i++) {
			for(int j=0; j<=i ; j++) {
				if(i==j) {
				System.out.print("$");
				} else {
					System.out.print("\\");
				}
				
			}
			System.out.println();
		}
	}

}
