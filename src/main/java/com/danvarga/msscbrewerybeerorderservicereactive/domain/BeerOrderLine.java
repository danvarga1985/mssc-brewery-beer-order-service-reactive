package com.danvarga.msscbrewerybeerorderservicereactive.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@Document
public class BeerOrderLine {

    @Id
    UUID id;
    Timestamp createdDate;
    Timestamp lastModifiedDate;
    BeerOrder beerOrder;
    UUID beerId;
    String upc;
    Integer orderQuantity = 0;
    Integer quantityAllocated = 0;

    @Builder
    public BeerOrderLine(UUID id, Timestamp createdDate, Timestamp lastModifiedDate, BeerOrder beerOrder, UUID beerId,
                         String upc, Integer orderQuantity, Integer quantityAllocated) {
        this.id = id;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.beerOrder = beerOrder;
        this.beerId = beerId;
        this.upc = upc;
        this.orderQuantity = orderQuantity;
        this.quantityAllocated = quantityAllocated;
    }
}
