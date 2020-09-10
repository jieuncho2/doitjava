package chapter05;

public class Student {
	/* 필드 -  멤버 변수 */
	int studentID;
	String studentName;
	int grade;
	String address;
	
	/* 생성자 - 객체를 생성할 때 실행 하는 블록 */
	Student(int num1, long num2){	//매개 변수가 없는 생성자
		System.out.println("Student 객체를 생성합니다.");
	}	//디폴트 생성자는 매개변수가 없고 실행 코드가 없는 생성자
	Student(int num1, int num2){	//매개 변수가 없는 생성자
		System.out.println("Student 객체를 생성합니다.");
	}
	Student(long num1, int num2){	//매개 변수가 없는 생성자
		System.out.println("Student 객체를 생성합니다.");
	}
	
	//	Student(){} //디폴트 생성자: 생성자를 명시하지 않으면 자동으로 생성
	Student(long num){	//매개 변수가 없는 생성자
		System.out.println("Student 객체를 생성합니다." + num);
	}
	Student(){	//매개 변수가 없는 생성자
		System.out.println("디폴트 생성자로 Student 객체를 생성합니다.");
	}
	
	/* 메소드 - 멤버 함수 */
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
}
