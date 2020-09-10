package chapter05;

public class Company {

	private static Company Instance = new Company();

	private Company() {
		
	}
	
	public static Company getInstance() {
		if(Instance == null) {
			Instance = new Company();
		}
		return Instance;
	}

}
