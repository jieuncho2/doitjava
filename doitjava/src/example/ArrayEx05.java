package example;

public class ArrayEx05 {

	public static void main(String[] args) {
		//����ø��� ���� �޶����� �����Լ��� ����Ͽ�
		//6���� ��Ҹ� ���� �迭�� ���� �� ����ϼ���.
		
		int[] arr = new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45) + 1;
			System.out.print(arr[i] + " ");
		}
		
	}

}
