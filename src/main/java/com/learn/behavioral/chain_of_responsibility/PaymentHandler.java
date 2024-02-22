package behavioral.chain_of_responsibility;

public abstract class PaymentHandler {

	protected PaymentHandler next;

	public void setNext(PaymentHandler next) {
		this.next = next;
	}

	public abstract void handlePayment(double amount);

}
