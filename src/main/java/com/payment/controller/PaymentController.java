package com.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payment.entities.PaymentBean;
import com.payment.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentservice;
	@PostMapping("/insert")
	public ResponseEntity<PaymentBean> postData(@RequestBody PaymentBean bean) {
		PaymentBean insert = this.paymentservice.insert(bean);
		return new ResponseEntity(insert, HttpStatus.CREATED);
	}

}
