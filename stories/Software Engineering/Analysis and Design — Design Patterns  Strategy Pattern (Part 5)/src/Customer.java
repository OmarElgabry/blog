
public class Customer {
	private String userName;
	private String password;
	
	Customer(String _userName, String _password){
		userName = _userName;
		password = _password;
	}

	public void IntiatePayment(Payment paymentMethod, double amount){
		paymentMethod.setPayment(amount, userName);
	}
	
}
