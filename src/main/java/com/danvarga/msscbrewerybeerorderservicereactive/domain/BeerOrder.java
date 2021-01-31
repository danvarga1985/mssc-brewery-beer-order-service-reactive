package com.danvarga.msscbrewerybeerorderservicereactive.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@Document
public class BeerOrder {

    UUID id;
    Timestamp createdDate;
    Timestamp lastModifiedDate;
    String customerRef;
    Customer customer;
    Set<BeerOrderLine> beerOrderLines;
    BeerOrderStatusEnum orderStatusEnum = BeerOrderStatusEnum.NEW;
    String orderStatusCallbackUrl;

    @Builder
    public BeerOrder(UUID id, Timestamp createdDate, Timestamp lastModifiedDate, String customerRef, Customer customer,
                     Set<BeerOrderLine> beerOrderLines, BeerOrderStatusEnum orderStatusEnum,
                     String orderStatusCallbackUrl) {
        this.id = id;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customerRef = customerRef;
        this.customer = customer;
        this.beerOrderLines = beerOrderLines;
        this.orderStatusEnum = orderStatusEnum;
        this.orderStatusCallbackUrl = orderStatusCallbackUrl;
    }
}
