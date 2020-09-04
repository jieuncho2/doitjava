package chapter07;

public class ArrayEx03 {

	public static void main(String[] args) {
		//10개를 입력할 수 있는 배열을 생성하고 1부터 10까지 대입한 후
		//for문을 사용해서 합계를 출력하세요. (55)
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

	}

}
