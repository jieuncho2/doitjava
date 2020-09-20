package chapter08;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//매개 변수 자동 타입 변환
		driver.drive(bus);	//Vehivle vehicle = bus;
		driver.drive(taxi);	//Vehivle vehicle = taxi;
	}

}
