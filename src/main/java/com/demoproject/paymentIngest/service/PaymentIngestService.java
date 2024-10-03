package com.demoproject.paymentIngest.service;

import com.demoproject.paymentIngest.domain.OneTimePaymentResourcePojo;
import com.demoproject.paymentIngest.entity.PaymentTransaction;
import com.demoproject.paymentIngest.repository.PaymentIngestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentIngestService {

    @Autowired
    PaymentIngestRepo paymentIngestRepo;

    public OneTimePaymentResourcePojo createPaymentTransaction(OneTimePaymentResourcePojo oneTimePaymentResourcePojo){
        PaymentTransaction paymentTransaction =new PaymentTransaction();
        //oneTimePaymentResource.setTransactionId();
        paymentTransaction.setTransactionId(oneTimePaymentResourcePojo.getTransactionId());
        paymentTransaction.setPaymentSubType(oneTimePaymentResourcePojo.getSubType());
        paymentTransaction.setCartId(oneTimePaymentResourcePojo.getCartId());
        paymentTransaction.setAmount(oneTimePaymentResourcePojo.getAmount());
        paymentTransaction.setOrderNumber(oneTimePaymentResourcePojo.getOrderNumber());
        paymentTransaction.setChannel(oneTimePaymentResourcePojo.getChannel());
        paymentIngestRepo.save(paymentTransaction);
        return oneTimePaymentResourcePojo;
    }


}
