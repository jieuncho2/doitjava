package example;

public class ArrayEx03 {

	public static void main(String[] args) {
		//5���� ������ �Է¹޾� �迭�� �ְ� �Է¹��� �� �� Max�� Min�� ����ϼ���
		
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
