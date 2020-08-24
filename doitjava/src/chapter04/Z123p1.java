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
			System.out.println("연산자 오류입니다");
			return;
		}
		System.out.println("결과값은 " + result + "입니다");
		
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
				System.out.println("연산자 오류입니다");
				return;
		}
		System.out.println("결과 값은 " + result + "입니다");

		
	}

}
