package chapter13_2;

public class TestMyNumber {
	public static void main(String[] args) {
//		MyNumber max = (x, y) -> (x>=y) ? x : y;
//		System.out.println(max.getMax(10, 20));
		
		int num1 = 10;
		int num2 = 20;
		//Ŭ���� ����� ��ü ����
		MyNumber in = new ImplNumber();
		int result = in.getMax(num1, num2);
		System.out.println("in: " + result);
		
		MyNumber in2 = new MyNumber() {
			
			@Override
			//�͸� ���� ��ü ����
			public int getMax(int num1, int num2) {
				// TODO Auto-generated method stub
				return (num1 >= num2) ? num1 : num2;
			}
		};
		result = in2.getMax(num1, num2);
		System.out.println("in2: " + result);
		
		/* �������̽��� �޼ҵ尡 1������ ��� ���� */
		// ���ٽ�
		MyNumber in3 = (int x, int y) -> x >= y ? x : y;
		result = in3.getMax(num1, num2);
		System.out.println("in3: " + result);
		/* ���� ������ �� ���̸� �߰�ȣ ���� */
		/* ���� ������ �ʿ䰡 ����. */
		/* �Ű� ������ �ڷ��� */
	}
}
