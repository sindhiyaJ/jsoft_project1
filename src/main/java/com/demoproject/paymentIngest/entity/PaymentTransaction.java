package com.demoproject.paymentIngest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PaymentTransaction")
public class PaymentTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;
    private String transactionId;
//    @ManyToOne
//    @JoinColumn(name = "payment_type_id")
//    private PaymentTransactionType paymentType;
    private String paymentSubType;
    private String cartId;
//    @ManyToOne
//    @JoinColumn(name = "customer_identity_id")
//    private CustomerIdentityResource customerIdentity;
    private BigDecimal amount;
//    @ManyToOne
//    @JoinColumn(name = "payment_allocations_id")
//    private set<PaymentAllocationResource> paymentAllocations;
    private String orderNumber;
    private LocalDate effectiveDate;
    private String channel;
    private String channelTransactionId;
    private boolean agentAssist;
    private String providerRefTransId;
    private OffsetDateTime entryTimestamp;
    private OffsetDateTime processedTimeStamp;
//    @ManyToOne
//    @JoinColumn(name = "status_id")
//    private PymtTransStatusResource status;
    private String maskedAccountNumber;
    private String providerName;
//    @ManyToOne
//    @JoinColumn(name = "result_id")
//    private OneTimePaymentResultResource result;
    private String terminalId;
    private String billerMemo;
    private OffsetDateTime entryTime;
    private String thirdPartyVerified;
//    @ManyToOne
//    @JoinColumn(name = "user_detail_id")
//    private UserDetailResource userDetail;


}
