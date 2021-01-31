package com.danvarga.msscbrewerybeerorderservicereactive.repositories;

import com.danvarga.msscbrewerybeerorderservicereactive.domain.BeerOrderLine;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import java.util.UUID;

public interface BeerOrderLineRepository extends ReactiveMongoRepository<BeerOrderLine, UUID> {
}
