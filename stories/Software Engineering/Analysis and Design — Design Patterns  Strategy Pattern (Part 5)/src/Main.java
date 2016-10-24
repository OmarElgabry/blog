
public class Main {

	public static void main(String[] args) {
		Customer Customer1 = new Customer("Albert", "4d@v78^vglkb");
		Customer Customer2 = new Customer("Neeraj", "56(n@#fggo");
		
		// Customer 1 
		Customer1.IntiatePayment(new Paypal(), 3300.50);
		Customer1.IntiatePayment(new CreditCard(), 990.23);
		
		// Customer 2
		Customer2.IntiatePayment(new CreditCard(), 80090.4);
	}

}
