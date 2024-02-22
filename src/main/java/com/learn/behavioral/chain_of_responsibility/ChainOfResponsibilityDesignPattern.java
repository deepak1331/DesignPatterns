package behavioral.chain_of_responsibility;

public class ChainOfResponsibilityDesignPattern {

	public static void main(String[] args) {

		PaymentHandler wallet = new WalletPaymentHandler();
		PaymentHandler upi = new UpiPaymentHandler();
		PaymentHandler bank = new BankPaymentHandler();
		PaymentHandler creditCard = new CreditCardPaymentHandler();
		
		wallet.setNext(upi);
		upi.setNext(bank);
		bank.setNext(creditCard);
		
		
		wallet.handlePayment(150);
		wallet.handlePayment(1200);
		wallet.handlePayment(4500);
		wallet.handlePayment(7500);

	}

}
