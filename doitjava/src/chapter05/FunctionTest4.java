package chapter05;

public class FunctionTest4 {
	public static void main(String[] args) {
		Operator o = new Operator();	//클래스의 이름과 동일한 매소드는 생성자라고 합니다.
		System.out.println(o.add(1, 2));
		System.out.println(o.add(10, 20));
		System.out.println(o.add(30, 20));
	}
}
