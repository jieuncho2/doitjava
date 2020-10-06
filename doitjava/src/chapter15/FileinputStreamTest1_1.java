package chapter15;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileinputStreamTest1_1 {

	public static void main(String[] args) {
		FileReader fis = null;
		
		try {
			fis = new FileReader("C:\\Users\\yn-10\\git\\doitjava\\doitjava\\src\\chapter15\\input.txt");
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
			int word;
			while((word = fis.read()) != -1) {
				System.out.print((char)word);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}