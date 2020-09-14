package chapter08;

public class GOLDCustomer extends Customer{	
	
	private int agentID;
	double saleRatio;
	
	public GOLDCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	public GOLDCustomer() {
		
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
}
