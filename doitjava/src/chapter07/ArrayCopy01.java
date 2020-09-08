package chapter07;

public class ArrayCopy01 {

	public static void main(String[] args) {
		int[] arr1 = new int[] {10,20,30};
		int[] arr2 = new int[5];
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		int[] arr3 = new int[10];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}

	}

}
