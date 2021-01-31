package com.danvarga.msscbrewerybeerorderservicereactive.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Customer {

    @Id
    UUID id;
    Timestamp createdDate;
    Timestamp lastModifiedDate;
    String customerName;
    UUID apiKey;
    Set<BeerOrder> beerOrders;
}
