package chapter04;

public class ForEx {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while(num<11) {
			sum += num++;
		}
		System.out.println(sum);
		
		int i = 0;
		int res = 0;
		for(i = 1; i < 11; i++) {
			res += i;
		}
		System.out.println(res);
		
		int i2 = 0;
		int res2 = 0;
		for(i2 = 1; i2 < 11; i2 = i2 * 2) {
			res2 += i2;
		}
		System.out.println(res2);
	}

}

/*
 *  증감식은 식이 들어가는 공간입니다.
 *  i++ -> i += 1 -> i = i + 1
 */