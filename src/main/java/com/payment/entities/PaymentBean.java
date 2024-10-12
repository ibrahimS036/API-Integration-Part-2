package com.payment.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PaymentBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PaymentId;
	private String TransactionId;
	private String PaymentStatus;
	private int OrderId;
	private int OrderAmount;

	public int getPaymentId() {
		return PaymentId;
	}

	public void setPaymentId(int paymentId) {
		PaymentId = paymentId;
	}

	public String getTransactionId() {
		return TransactionId;
	}

	public void setTransactionId(String string) {
		TransactionId = string;
	}

	public String getPaymentStatus() {
		return PaymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		PaymentStatus = paymentStatus;
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public int getOrderAmount() {
		return OrderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		OrderAmount = orderAmount;
	}

	public PaymentBean(int paymentId, String transactionId, String paymentStatus, int orderId, int orderAmount) {
		super();
		PaymentId = paymentId;
		TransactionId = transactionId;
		PaymentStatus = paymentStatus;
		OrderId = orderId;
		OrderAmount = orderAmount;
	}

	public PaymentBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PaymentBean [PaymentId=" + PaymentId + ", TransactionId=" + TransactionId + ", PaymentStatus="
				+ PaymentStatus + ", OrderId=" + OrderId + ", OrderAmount=" + OrderAmount + "]";
	}

}
