package example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx03_2 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개 입력해 주세요: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Max: " + arr[arr.length-1]);
		System.out.println("Min: " + arr[0]);
		
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		sc.close();
	}

}
