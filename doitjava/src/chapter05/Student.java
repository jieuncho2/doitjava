package chapter05;

public class Student {
	/* �ʵ� -  ��� ���� */
	int studentID;
	String studentName;
	int grade;
	String address;
	
	/* ������ - ��ü�� ������ �� ���� �ϴ� ��� */
	Student(int num1, long num2){	//�Ű� ������ ���� ������
		System.out.println("Student ��ü�� �����մϴ�.");
	}	//����Ʈ �����ڴ� �Ű������� ���� ���� �ڵ尡 ���� ������
	Student(int num1, int num2){	//�Ű� ������ ���� ������
		System.out.println("Student ��ü�� �����մϴ�.");
	}
	Student(long num1, int num2){	//�Ű� ������ ���� ������
		System.out.println("Student ��ü�� �����մϴ�.");
	}
	
	//	Student(){} //����Ʈ ������: �����ڸ� ������� ������ �ڵ����� ����
	Student(long num){	//�Ű� ������ ���� ������
		System.out.println("Student ��ü�� �����մϴ�." + num);
	}
	Student(){	//�Ű� ������ ���� ������
		System.out.println("����Ʈ �����ڷ� Student ��ü�� �����մϴ�.");
	}
	
	/* �޼ҵ� - ��� �Լ� */
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
}
