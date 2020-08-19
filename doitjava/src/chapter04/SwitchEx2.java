package chapter04;

public class SwitchEx2 {

	public static void main(String[] args) {
		int now = 10;
		
		System.out.println("현재 시간은 " + now + "시입니다.");
		System.out.println("남은 일정은 다음과 같습니다.");
		
		switch(now) {
			case 9:
			System.out.println("9시에는 출근을 합니다.");
			break;
			case 10:
				System.out.println("10시에는 아침 조회를 합니다.");
				break;
			case 11:
				System.out.println("11시에는 오전 업무를 시작합니다.");
				break;
			case 12:
				System.out.println("12시에는 점심을 먹습니다.");
				break;
		
		}
		
		String pos = "부장";
		switch(pos) {
			case "부장":
				System.out.println("부장의 월급은 400만원입니다.");
				break;
			case "과장":
				System.out.println("과장의 월급은 400만원입니다.");
				break;
			case "대리":
				System.out.println("대리의 월급은 400만원입니다.");
				break;
			default:
				System.out.println("일반 사람의 월급은 400만원입니다.");
		
		}

	}

}
