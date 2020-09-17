package chapter10;

class Student {
	int studentId;
	String studentName;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public String toString() {
		return studentId + "," + studentName;
	}
}

public class EqualsTest {
	public void main(String[] args) {
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");

		if (studentLee == studentLee2) {
			System.out.println("주소는 같습니다.");
		} else {
			System.out.println("주소는 다릅니다.");
		}

		if (studentLee.equals(studentLee2)) {
			System.out.println("동일합니다.");
		} else {
			System.out.println("동일하지 않습니다.");
		}

		if (studentLee == studentSang) {
			System.out.println("주소는 같습니다.");
		} else {
			System.out.println("주소는 다릅니다.");
		}

		if (studentLee.equals(studentSang)) {
			System.out.println("동일합니다.");
		} else {
			System.out.println("동일하지 않습니다.");
		}
	}
}