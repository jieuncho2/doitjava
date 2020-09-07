package chapter07;

public class AdvanacedFor01_1 {

	public static void main(String[] args) {
		int[] arr = new int[] {10,20,30,40,50};
		for(int i=0; i<arr.length; i++) {
			System.out.print("(" + i + ")" + arr[i] + " ");
		}
		System.out.println();
		
		int index = 0;
		for(int num:arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
