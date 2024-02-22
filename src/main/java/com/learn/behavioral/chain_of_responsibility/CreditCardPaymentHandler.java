package behavioral.chain_of_responsibility;

public class CreditCardPaymentHandler extends PaymentHandler {
	

	public void handlePayment(double amount) {

		if(amount>5000) {
			System.out.println("Payment made using CreditCard for : Rs."+amount);
		}else {
			next.handlePayment(amount);
		}
	}


}
