package chapter13_2;

public class ImplNumber implements MyNumber {
	@Override
	public int getMax(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1 >= num2) ? num1 : num2;
	}
}
