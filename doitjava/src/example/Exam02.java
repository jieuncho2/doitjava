package example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Á¤¼ö¸¦ ÀÔ·ÂÇØ ÁÖ¼¼¿ä: ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Â¦¼öÀÔ´Ï´Ù");
		} else {
			System.out.println("È¦¼öÀÔ´Ï´Ù");
		}
		
		if(num%2==0) System.out.println("Â¦¼ö2");
		else System.out.println("È¦¼ö2");
		
		System.out.println(num%2==0 ? "Â¦¼ö3":"È¦¼ö3");
		
		String str = ""; // T
		if(num%2==0) {
			str = "Â¦¼ö4";
		} else {
			str = "È¦¼ö4";
		}
		System.out.println(str);
		
		sc.close();
	}

}
