package chapter15;

import java.io.IOException;

public class SysteminTest2 {
	public static void main(String[] args) throws IOException {
		System.out.println("���ĺ� ���� ���� ���� [Enter]�� ��������");
		
		int i;
		try {
			while((i = System.in.read()) != -1) {
				System.out.print((char)i);				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
