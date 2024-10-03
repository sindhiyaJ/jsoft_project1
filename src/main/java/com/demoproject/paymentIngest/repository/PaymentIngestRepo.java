package com.demoproject.paymentIngest.repository;

import com.demoproject.paymentIngest.entity.PaymentTransaction;
import org.springframework.data.repository.CrudRepository;

public interface PaymentIngestRepo extends CrudRepository<PaymentTransaction,Integer> {
}
