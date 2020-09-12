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
		System.out.println("가위바위보 게임입니다.");
		System.out.println("0: 가위, 1: 바위, 2: 보");
		System.out.print("> ");
		user = sc.nextInt();
		
		if(user==0) {
			System.out.println("가위를 내셨습니다");
			if(com==2) {
				System.out.println("컴퓨터: 보");
				System.out.println("이겼습니다");
			} else if(com==1) {
				System.out.println("컴퓨터: 바위");
				System.out.println("졌습니다");
			} else {
				System.out.println("컴퓨터: 가위");
				System.out.println("비겼습니다");
			}
		} else if(user==1) {
			System.out.println("바위를 내셨습니다");
			if(com==1) {
				System.out.println("컴퓨터: 바위");
				System.out.println("비겼습니다");
			} else if(com==2) {
				System.out.println("컴퓨터: 보");
				System.out.println("졌습니다");
			} else {
				System.out.println("컴퓨터: 가위");
				System.out.println("이겼습니다");
			}
		} else if(user==2) {
			System.out.println("보를 내셨습니다");
			if(com==0) {
				System.out.println("컴퓨터: 가위");
				System.out.println("이겼습니다");
			} else if(com==1) {
				System.out.println("컴퓨터: 바위");
				System.out.println("이겼습니다");
			} else {
				System.out.println("컴퓨터: 보");
				System.out.println("비겼습니다");
				}
			}
		}
	}
