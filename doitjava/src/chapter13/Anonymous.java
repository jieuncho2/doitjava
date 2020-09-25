package chapter13;

public class Anonymous {
	//�ʵ� �ʱⰪ���� ����
	Person filed = new Person();

	void work() {
		System.out.println("����մϴ�.");
	}

	void wake() {
		System.out.println("6�ÿ� �Ͼ�ϴ�.");
		work();
	}

	void method1() {
		//���� ���������� ����
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		//���� ���� ���
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}
