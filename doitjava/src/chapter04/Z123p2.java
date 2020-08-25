package chapter04;

public class Z123p2 {

	public static void main(String[] args) {
		
		int dan;
		int times;
		int res;
		
		for(dan=2; dan<=9; dan++) {
			if(dan%2 !=0) continue;
			for(times=1; times<=9; times++) {
				res = dan * times;
				System.out.println(dan + "X" + times + "=" + res);
			}
			System.out.println("홀수단입니다");
		}
		
	}

}
