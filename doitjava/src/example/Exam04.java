package example;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				sum += i;			
			}
		}
		System.out.println("1부터 10까지의 수 중 짝수의 합은 " + sum + "입니다");
		
		int sum1 = 0;
		for(int i=1; i<=10; i++) {
			if(i%2!=0) {
				continue;			
			}
			sum1 += i;
		}
		System.out.println("1부터 10까지의 수 중 짝수의 합은 " + sum1 + "입니다");
	}

}