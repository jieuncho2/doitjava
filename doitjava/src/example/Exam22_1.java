package example;

import java.util.Scanner;

public class Exam22_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int com = (int)(Math.random()*100)+1;
		int user = 0;
		int cnt = 0;
		
		System.out.println("���� ���߱� ������ �����մϴ�.");
		System.out.println("1���� 100���� ���� �� ������ ���ڴ� �����ϱ��?");
		
		while(true) {
			System.out.print("> ");
			user = sc.nextInt();
			System.out.println(++cnt + "ȸ �Է��ϼ̽��ϴ�.");
			if(user>com) {
				System.out.println("�Է��Ͻ� ���ں��� �Ʒ��� �ֽ��ϴ�. down");
			} else if(user<com) {
				System.out.println("�Է��Ͻ� ���ں��� ���� �ֽ��ϴ�. up");
			} else {
				System.out.println("�����Դϴ�. ������ �����մϴ�.");
				sc.close();
				break;
			}
		}
	}
}
//		while(true) {
//			com = (int)(Math.random()*100);
//			System.out.println("���ٿ� �����Դϴ�.");
//			System.out.println("1���� 100���� ���� �� ������ ���ڴ� �����ΰ���?");
//			System.out.print("> ");
//			user = sc.nextInt();
//			
//			if(user==com) {
//				System.out.println("����");
//			} else if(user<com) {
//				System.out.println("up");
//			} else if(user>com){
//				System.out.println("down");
//			} else {
//				System.out.println("����");
//			}
//		}
//	}
//}
