package com.danvarga.msscbrewerybeerorderservicereactive.repositories;

import com.danvarga.msscbrewerybeerorderservicereactive.domain.BeerOrder;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import java.util.UUID;

public interface BeerOrderRepository extends ReactiveMongoRepository<BeerOrder, UUID> {
}
