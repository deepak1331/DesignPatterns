package com.learn.behavioral.chain_of_responsibility.handler;

import com.learn.behavioral.chain_of_responsibility.handler.impl.PaymentHandler;

public class BankPaymentHandler extends PaymentHandler {

	public void handlePayment(double amount) {

		if (amount <= 5000) {
			System.out.println("Payment made using Banking for : Rs." + amount);
		} else {
			next.handlePayment(amount);
		}
	}

}
