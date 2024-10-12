package com.payment.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.payment.entities.PaymentBean;
import com.payment.repo.PaymentRepo;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepo paymentrepo;

	public PaymentBean insert(PaymentBean bean) {
		
		bean.setTransactionId(UUID.randomUUID().toString());
		bean.setPaymentStatus(new Random().nextBoolean()?"sucess":"Failed");
		PaymentBean save = this.paymentrepo.save(bean);
		return save;
	}

}
