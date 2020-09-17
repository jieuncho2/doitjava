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
		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "�̻��");

		if (studentLee == studentLee2) {
			System.out.println("�ּҴ� �����ϴ�.");
		} else {
			System.out.println("�ּҴ� �ٸ��ϴ�.");
		}

		if (studentLee.equals(studentLee2)) {
			System.out.println("�����մϴ�.");
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}

		if (studentLee == studentSang) {
			System.out.println("�ּҴ� �����ϴ�.");
		} else {
			System.out.println("�ּҴ� �ٸ��ϴ�.");
		}

		if (studentLee.equals(studentSang)) {
			System.out.println("�����մϴ�.");
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}
}