package example;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		int cnt=1;
		int res=0;
		while(cnt<=10) {
			res += cnt++;
		}
		System.out.println("1���� 10������ ���� " + res + "�Դϴ�");
		
		int sum = 0; // T
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1���� 10������ ���� " +sum + "�Դϴ�");
	}

}
