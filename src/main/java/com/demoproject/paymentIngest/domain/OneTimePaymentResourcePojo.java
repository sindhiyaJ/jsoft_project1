package com.demoproject.paymentIngest.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
@Data
@NoArgsConstructor
public class OneTimePaymentResourcePojo {

    private String Id;
    private String transactionId;
    @JsonProperty("paymentSubType")
    private String SubType;
    private String cartId;
    private BigDecimal amount;
    private String orderNumber;
    private LocalDate effectiveDate;
    private String channel;
    private String channelTransactionId;
    private boolean agentAssist;
    private String providerRefTransId;
    private OffsetDateTime entryTimestamp;
    private OffsetDateTime processedTimeStamp;

}
