package example;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		
		int cnt = 1;
		System.out.println("ī��Ʈ: " + cnt);
		Scanner sc = new Scanner(System.in);
		System.out.print("1��° ����: ");
		int num1 = sc.nextInt();
		System.out.print("2��° ����: ");
		int num2 = sc.nextInt();
		System.out.print("3��° ����: ");
		int num3 = sc.nextInt();
		
		int com1 = (int)(Math.random()*9)+1;
		int com2 = (int)(Math.random()*9)+1;
		int com3 = (int)(Math.random()*9)+1;
		String result = "Strike: " + 0+ "Ball: ";
		
		if(num1==com1&&num2==com2&&num3==com3) {
			System.out.println("�� ���߾��!");
			cnt++;
		} else if(num1==com1||num2==com2||num3==com3){
			System.out.println(result);
			cnt++;
		}
	}
}
