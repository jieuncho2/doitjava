package chapter14;

public class ArrayException1 {
	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			arr[3] = 100;
			System.out.println("���� ���� �߽��ϴ�.");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("�迭�� ������ ����ų� ��� ���꿡 ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		}
	}
}
