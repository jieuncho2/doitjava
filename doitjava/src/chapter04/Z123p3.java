package chapter04;

public class Z123p3 {

	public static void main(String[] args) {
		
		int dan;
		int times;
		int res;
		
		for(dan=2; dan<=9; dan++) {
			for(times=1; times<=9; times++) {
				if(!(times<=dan)) break;
				res = dan * times;
				System.out.println(dan + "X" + times + "=" + res);
			}
			System.out.println("���� ���ϴ� ������ Ů�ϴ�");
		}
		
	}

}
