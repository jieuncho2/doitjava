package chapter12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);	//asLIst로 생성된 list는 추가 삭제가 불가합니다.
		System.out.println(list.size());
		
		System.out.println("이터레이터");
		Iterator<Integer> ir = list.iterator();
		while(ir.hasNext()) {
			int number = ir.next();
			System.out.println(number);
		}
		
		System.out.println("for문");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("향상된 for문");
		for(int num: list) {
			System.out.println(num);
		}
		
//		System.out.println("list에서 앞의 자료를 삭제하며 출력");
//		while(!list.isEmpty()) {	//지원 안 함...
//			int number = list.remove(0);
//			System.out.println(number);
//		}
	}

}
