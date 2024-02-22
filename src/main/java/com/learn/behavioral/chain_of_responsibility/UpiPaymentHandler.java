package behavioral.chain_of_responsibility;

public class UpiPaymentHandler extends PaymentHandler {

	
	public void handlePayment(double amount) {
		if (amount <= 2000) {
			System.out.println("Payment made using UPI for : Rs." + amount);
		} else {
			next.handlePayment(amount);
		}
	}

}
