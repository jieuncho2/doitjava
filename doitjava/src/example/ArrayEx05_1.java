package example;

public class ArrayEx05_1 {

	public static void main(String[] args) {
		//실행시마다 값이 달라지는 랜덤함수를 사용하여
		//6개의 요소를 가진 배열을 만든 후 출력하세요.
		
		int[] arr = new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45) + 1;
			if(arr[i]!=arr[i]) {
				continue;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
