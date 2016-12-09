package parkingLot;

public class PaymentSystem {
	public enum PaymentMethod{
		CreditCard, Debit, Cash;
	}
	
	
	public double getCost(int hrs){
		return 2.0 * (double)hrs;
	}
	
	public void pay(PaymentMethod p, double cost){
		//charge p
	}
}
