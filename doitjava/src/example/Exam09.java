package example;

public class Exam09 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=50; i++) {
			sum += i;
		}
		double ave = (double)sum / 50;
		System.out.println("1���� 50������ ���� ����� " + ave + "�Դϴ�");
		
		double ave2 = sum / 50.0;
		System.out.println("1���� 50������ ���� ����� " + ave2 + "�Դϴ�");
	}
}