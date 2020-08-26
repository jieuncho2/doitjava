package example;

public class Exam09 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=50; i++) {
			sum += i;
		}
		double ave = (double)sum / 50;
		System.out.println("1부터 50까지의 합의 평균은 " + ave + "입니다");
		
		double ave2 = sum / 50.0;
		System.out.println("1부터 50까지의 합의 평균은 " + ave2 + "입니다");
	}
}