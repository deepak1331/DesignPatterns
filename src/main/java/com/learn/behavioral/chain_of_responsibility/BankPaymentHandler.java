package behavioral.chain_of_responsibility;

public class BankPaymentHandler extends PaymentHandler {

	public void handlePayment(double amount) {

		if (amount <= 5000) {
			System.out.println("Payment made using Banking for : Rs." + amount);
		} else {
			next.handlePayment(amount);
		}
	}

}
