package example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ���: ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("¦���Դϴ�");
		} else {
			System.out.println("Ȧ���Դϴ�");
		}
		
		if(num%2==0) System.out.println("¦��2");
		else System.out.println("Ȧ��2");
		
		System.out.println(num%2==0 ? "¦��3":"Ȧ��3");
		
		String str = ""; // T
		if(num%2==0) {
			str = "¦��4";
		} else {
			str = "Ȧ��4";
		}
		System.out.println(str);
		
		sc.close();
	}

}
