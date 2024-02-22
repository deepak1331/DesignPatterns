package com.learn.behavioral.chain_of_responsibility.handler.impl;

public class WalletPaymentHandler extends PaymentHandler {

	public void handlePayment(double amount) {

		if (amount <= 1000) {
			System.out.println("Payment made using Digital Wallet for : Rs." + amount);
		} else {
			next.handlePayment(amount);
		}
	}

}
