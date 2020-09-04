package chapter07;

public class ArrayEx04 {

	public static void main(String[] args) {
		//10개를 입력할 수 있는 배열을 생성하고 1부터 10까지 대입한 후
		//for문을 사용해서 합계를 출력하세요. (55)
		
		int arr1[] = {1,2,3,4,5};
//		arr1[] = {10,20,30,40,50};	//	중괄호는 초기화할 때만 사용이 가능합니다.
		arr1[0] = 10;	//	배열의 요소들은 모두 변수처럼 사용이 가능합니다.
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		int[] arr2 = new int[10];
		System.out.println(arr2.length);
		arr2 = arr1;	//	배열에 배열을 대입할 수 있습니다.
		System.out.println(arr2.length);
		System.out.println();
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		int a = 10;
		int b = 20;
		b = a;
		System.out.println();
		System.out.println(b);
		
		arr2 = new int[] {100,200,300};	//	
//		arr2 = {10,20,30};	// 중괄호는 최초의 초기화에만 사용이 가능합니다.

	}

}
