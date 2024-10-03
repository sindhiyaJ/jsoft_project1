package com.demoproject.paymentIngest.controller;

import com.demoproject.paymentIngest.domain.OneTimePaymentResourcePojo;
import com.demoproject.paymentIngest.entity.PaymentTransaction;
import com.demoproject.paymentIngest.service.PaymentIngestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("payments")
public class PaymentIngestController {
    @Autowired
    PaymentIngestService paymentIngestService;


    @PostMapping("/ingest/v1")
    public ResponseEntity<OneTimePaymentResourcePojo> createPaymentTransaction(@RequestBody OneTimePaymentResourcePojo oneTimePaymentResourcePojo,
                                                                       @RequestHeader(value = "ClientId-Header", required = true) String clientid,
                                                                       @RequestHeader(value = "transactionId ",required = true) String transactionid,
                                                                       @RequestHeader(value = "UserId", required = false) String userid){
//        log.info("createPaymentTransaction called");
        OneTimePaymentResourcePojo result = paymentIngestService.createPaymentTransaction(oneTimePaymentResourcePojo);
//        log.info("createPaymentTransaction end");
         return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
