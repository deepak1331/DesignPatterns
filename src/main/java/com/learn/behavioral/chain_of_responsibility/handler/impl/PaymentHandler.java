package com.learn.behavioral.chain_of_responsibility.handler.impl;

public abstract class PaymentHandler {

	protected PaymentHandler next;

	public void setNext(PaymentHandler next) {
		this.next = next;
	}

	public abstract void handlePayment(double amount);

}
