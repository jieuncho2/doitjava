package chapter10;

import com.sun.org.glassfish.gmbal.Description;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void Description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
}
