package chapter12;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[])(new Object[capacity]);
	}	// 타입 피라미터 배열을 생성하려면 new T[n] 형태로 배열을 생성
		// (T[]) (new Object[n])으로 생성해야 한다.
	public String getName() {
		return name;
	}
	public T[] getStudents() {
		return students;
	}
	public void add(T t) {	//배열에 비어있는 부분을 찾아서 수강생을
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
