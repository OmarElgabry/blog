
public class CreditCard implements Payment{

	@Override
	public void setPayment(double amount, String userName) {
		System.out.println(userName+" has Successfly paid "+ amount +" with Credit Card");
		
	}

}
