package chapter04;

public class Z123p1 {

	public static void main(String[] args) {
		
		int num1 =10;
		int num2 = 2;
		char operator = 's';
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
		} else if(operator == '-') {
			result = num1 - num2;
		} else if(operator == '*') {
			result = num1 * num2;
		} else if(operator == '/') {
			result = num1 / num2;
		} else {
			System.out.println("������ �����Դϴ�");
			return;
		}
		System.out.println("������� " + result + "�Դϴ�");
		
		switch(operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				System.out.println("������ �����Դϴ�");
				return;
		}
		System.out.println("��� ���� " + result + "�Դϴ�");

		
	}

}
