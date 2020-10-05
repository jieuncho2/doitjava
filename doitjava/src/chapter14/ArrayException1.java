package chapter14;

public class ArrayException1 {
	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			arr[3] = 100;
			System.out.println("정상 실행 했습니다.");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("배열의 범위를 벗어나거나 산술 연산에 문제가 발생했습니다.");
			e.printStackTrace();
		}
	}
}
