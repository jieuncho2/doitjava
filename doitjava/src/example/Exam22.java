package example;

import java.util.Scanner;

public class Exam22 {

	public static void main(String[] args) {
		int user, com;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			com = (int)(Math.random()*100);
			System.out.println("���ٿ� �����Դϴ�.");
			System.out.println("1���� 100���� ���� �� ������ ���ڴ� �����ΰ���?");
			System.out.print("> ");
			user = sc.nextInt();
			
			if(user==com) {
				System.out.println("����");
			} else if(user<com) {
				System.out.println("up");
			} else if(user>com){
				System.out.println("down");
			} else {
				System.out.println("����");
			}
		}
	}
}
