package example;

public class Arsterlisk4 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {	//	row
			for(int j=0; j<5; j++) {
				if(4-i>j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(int i=3; i>=0; i--) {	//	row
			for(int j=0; j<5; j++) {
				if(4-i>j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
