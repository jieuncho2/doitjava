package example;

import java.util.Scanner;

public class Exam12_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����ұ��?: ");
		int line = sc.nextInt();
		for(int i=line-1; i>=0; i--) {
			for(int j=0; j<=i ; j++) {
				if(j==i) {
					System.out.print("@");
				} else {
					System.out.print("$");
				}
				
			}
			System.out.println();
		}
		sc.close();
		
//		for(int i=9; i>=0; i--) {
//			System.out.println(i);
//		}
	}

}
