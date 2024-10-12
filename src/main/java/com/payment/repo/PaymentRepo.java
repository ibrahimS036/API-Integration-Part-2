package com.payment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.payment.entities.PaymentBean;

@Repository
public interface PaymentRepo extends JpaRepository<PaymentBean, Integer> {

}
