package example;

public class Arsterlisk05 {

	public static void main(String[] args) {
		for(int i=4; i>=0; i--) {	//	row
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println(i+1);
		}

	}

}
