package example;

public class ArrayEx03 {

	public static void main(String[] args) {
		//5개의 정수를 입력받아 배열에 넣고 입력받은 수 중 Max와 Min을 출력하세요
		
		int[] Arr = new int[]{10,20,30};
		int min=Integer.MIN_VALUE;
		int max=Integer.MAX_VALUE;
		int num = 0;
		
		for(int i=0; i<Arr.length; i++){
			Arr[i] = num;
			if(Arr[i]>max) {
				max=Arr[i];
			}
			if(Arr[i]<min) {
				min=Arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
